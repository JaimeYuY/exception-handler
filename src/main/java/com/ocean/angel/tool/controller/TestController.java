package com.ocean.angel.tool.controller;

import com.ocean.angel.tool.common.ResultBean;
import com.ocean.angel.tool.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * 测试 Controller
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/exception")
    public ResultBean exception(Integer type) {
        return testService.test(type);
    }
}
