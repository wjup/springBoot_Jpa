package com.example.until;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:abc
 * @Description:
 * @params:$params$
 * @return: $returns$
 * @Date: $date$ $time$
 */
public class BeanUtils extends org.springframework.beans.BeanUtils  {
    /**
     * 把N个Object[]转换为List<bean>，要求实体类中字段的数量与顺序和Object[]中完全一致
     * @param sourceList
     * @param clazz 要转换的Bean的class
     * @return
     * @throws Exception
     */
    public static <T> List<T> ObjectArrListToBeanList(Class<T> clazz, Object[]...sourceList) throws Exception {
        List<T> list = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();

        for (Object[] objs : sourceList) {
            if (fields.length != objs.length) {
                throw new RuntimeException("Bean中字段与Object[]集合中的字段不匹配！");
            }
            T bean = clazz.newInstance();
            for(int i=0; i<fields.length; i++) {
                fields[i].setAccessible(true);
                fields[i].set(bean, objs[i]);
            }
            list.add(bean);
        }
        return list;
    }

    /**
     * 把Object[] 转换为Bean
     * @param clazz
     * @param source
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T ObjtctToBean(Class<T> clazz, Object[] source) throws Exception {
        List<T> ts = ObjectArrListToBeanList(clazz, source);
        if (ts != null && ts.size() > 0) {
            return ts.get(0);
        }
        return null;
    }
}
