package com.guohong.spring.controller;

import com.guohong.spring.pojo.Test;
import com.guohong.spring.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guohong
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping(value = "test")
    public List<Test> getTest() {

        return testService.getTest();
    }

}
