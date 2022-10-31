package com.jjh.service.Impl;/**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */

import com.jjh.mapper.TestDao;
import com.jjh.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *@ClassName TestServiceImpl
 *@Description TODO
 *@Author jay
 *@version 1.0.0
 */

@Service
public class TestServiceImpl implements TestService {

    @Resource
    TestDao testDao;

    @Override
    public String getMessage() {
        String result = testDao.getAll();
        return result;
    }
}
