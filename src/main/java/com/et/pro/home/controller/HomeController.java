package com.et.pro.home.controller;

import com.et.pro.home.service.HomeService;
import com.et.pro.util.Result2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    HomeService homeService;
    @RequestMapping(value = "homeInfo",method = RequestMethod.GET)
    public Result2 getHomeInfo(){
        return homeService.getHomeInfo();
    }
}
