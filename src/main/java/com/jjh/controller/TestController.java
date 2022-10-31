package com.jjh.controller;/**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */

import com.jjh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@ClassName TestController
 *@Description TODO
 *@Author jay
 *@version 1.0.0
 */
@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/demo01")
    @ResponseBody
    public String demo01(){
        String message = testService.getMessage();
        return message;
    }

}
