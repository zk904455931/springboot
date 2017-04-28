package com.wode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by Dell on 2017/4/25.
 */
@Controller
public class UserController {
    @GetMapping("/")
    public  String index(){
    return "/login";


    }
}
