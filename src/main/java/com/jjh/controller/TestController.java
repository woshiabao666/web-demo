package com.jjh.controller;/**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */

import com.github.pagehelper.PageInfo;
import com.jjh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0.0
 * @ClassName TestController
 * @Description TODO
 * @Author jay
 */
@Controller
@CrossOrigin
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/demo01")
    @ResponseBody
    public PageInfo<Map<String, Object>> demo01(@RequestParam(value = "pageNum") Integer pageNum,
                                                @RequestParam(value = "pageSize") Integer pageSize,
                                                @RequestParam(value = "lastName",defaultValue = "") String lastName
    ) {
        PageInfo<Map<String, Object>> pageInfo = testService.getMessage(pageNum, pageSize,lastName);
//        List<Map<String, Object>> message = testService.getMessage(pageNum,pageSize);
//        Object[] objects = pageInfo.getList().toArray();
        return pageInfo;
    }

    @RequestMapping("/saveData")
    @ResponseBody
    public void saveData(@RequestParam("email") String email, @RequestParam("lastName") String lastName){
        System.out.println(lastName + email);
    }

}
