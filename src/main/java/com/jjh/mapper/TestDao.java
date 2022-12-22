package com.jjh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */

public interface TestDao {

    @SuppressWarnings("MybatisXMapperMethodInspection")
    List<Map<String,Object>> getAll(String name);

    @SuppressWarnings("MybatisXMapperMethodInspection")
    Integer updateMessage(HashMap<String,Object> map);
}
