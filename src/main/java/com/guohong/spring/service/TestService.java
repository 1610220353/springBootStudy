package com.guohong.spring.service;

import com.guohong.spring.mapper1.TestMapper;
import com.guohong.spring.pojo.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guohong
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> getTest(){

        return testMapper.selectAll();
    }

}
