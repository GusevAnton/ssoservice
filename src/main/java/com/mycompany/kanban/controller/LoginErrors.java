package com.mycompany.kanban.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by antongusev on 02.12.16.
 */
@Controller
public class LoginErrors {

    @RequestMapping("/")
    public String dashboard() {
        return "redirect:http://localhost:8007/#/dashboard";
    }

}