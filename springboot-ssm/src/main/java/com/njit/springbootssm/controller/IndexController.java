package com.njit.springbootssm.controller;

import com.njit.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:陈晓东
 * @Date:2020/1/1 22:26
 * @Email:2775398338@qq.com
 * @Description:
 */
@Controller
@RequestMapping("/page")
public class IndexController {
    @Autowired
    UserService userService;
    @GetMapping("/index/{id}")
    public String index(@PathVariable("id") String id, Model model){
        String username = userService.findUsername(id);
        model.addAttribute("name",username);
        return "myindex";
    }
}
