package com.jjh.service;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */
public interface TestService {

    public PageInfo<Map<String,Object>> getMessage(Integer pageNum, Integer pageSize,String name);

    public Integer updateMessage(HashMap<String,Object> updateParam);

}
