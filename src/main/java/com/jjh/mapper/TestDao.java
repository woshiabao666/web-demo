package com.jjh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: jay
 * @time: 2022/10/31
 */

public interface TestDao {
    List<Map<String,Object>> getAll();
}
