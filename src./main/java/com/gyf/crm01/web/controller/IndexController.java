package com.gyf.crm01.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){


        return  "index";
    }


    @RequestMapping("add")
    public String add(){

        return  "index";
    }

    @RequestMapping("delete")
    public String delete(){

        return  "index";
    }
}
