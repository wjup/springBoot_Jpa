package com.example.web;

import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:abc
 * @Description:
 * @params:$params$
 * @return: $returns$
 * @Date: $date$ $time$
 */

@Controller
public class IndexController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(){
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String hello(Model model){
        List<User> all = userService.findAll();
        model.addAttribute("all",all);
        return "index";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/add")
    public String add(UserDto userDto){
        userService.add(userDto);
        return "redirect:/list";
    }

    @RequestMapping("/del/{userId}")
    public String del(@PathVariable String userId){
        userService.del(userId);
        return "redirect:/list";
    }

    @RequestMapping("/edit/{userId}")
    public String edit(@PathVariable String userId, Model model){
        UserDto sel = userService.sel(userId);
        model.addAttribute("user",sel);
        return "edit";
    }

    @RequestMapping("/seach")
    public String seach(){
        return "seach";
    }

    @RequestMapping("/seachAll")
    public String seachAll(UserDto userDto,Model model){
        String userName = userDto.getUserName();
        String phone = userDto.getPhone();
        List<User> user = userService.seach(userName,phone);
        model.addAttribute("seachAll",user);
        return "seach";
    }
}
