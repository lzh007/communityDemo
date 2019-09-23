package com.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈Test〉
 *
 * @author lzh
 * @create 2019/9/23
 * @since 1.0.0
 */
@Controller
public class HelloController {
        @GetMapping("/hello")
        public String hello(@RequestParam(name = "name", required = false, defaultValue = "World")String name, Model model){
            model.addAttribute("name",name);
            return "/hello";
        }
}