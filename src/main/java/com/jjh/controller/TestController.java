package com.jjh.controller;/**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */

import com.github.pagehelper.PageInfo;
import com.jjh.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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

    public static final Logger logger = LoggerFactory.getLogger(TestController.class);

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
    public void saveData(@RequestParam("email") String email,
                         @RequestParam("lastName") String lastName,
                         @RequestParam("hireDate") String hireDate,
                         @RequestParam("salary") Double salary) throws ParseException {
        HashMap<String, Object> updateParam = new HashMap<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date paramDate = format.parse(hireDate);
        System.out.println(hireDate);
        System.out.println(paramDate.toLocaleString());
        logger.info("hireDate:{}",paramDate.toString());
        updateParam.put("email",email);
        updateParam.put("salary",salary);
        updateParam.put("lastName",lastName);
        updateParam.put("hireDate",paramDate);
        Integer result = testService.updateMessage(updateParam);
    }
}
