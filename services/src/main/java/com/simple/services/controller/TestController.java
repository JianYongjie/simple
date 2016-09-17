package com.simple.services.controller;

import com.simple.interfaces.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JIANYJ on 16/9/18.
 */
@Controller
@RequestMapping("/v1/service")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public Object test() {
        this.testService.test();
        return "ok";
    }


    @RequestMapping("/indx")
    public Object index() {
        return "test";
    }
}
