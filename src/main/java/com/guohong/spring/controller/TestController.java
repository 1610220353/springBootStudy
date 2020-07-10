package com.guohong.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guohong
 */
@RestController
public class TestController {


    @GetMapping(value = "test")
    public String getTest() {

        return "sess";
    }

}
