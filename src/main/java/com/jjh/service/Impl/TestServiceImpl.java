package com.jjh.service.Impl;/**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jjh.entity.Person;
import com.jjh.mapper.TestDao;
import com.jjh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
    public PageInfo<Map<String,Object>> getMessage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String,Object>> result = testDao.getAll();

        Person person = new Person();
        person.setData(result);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(result);


        return pageInfo;
    }
}
