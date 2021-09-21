package com.myblog.blog.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @author 阿福
 */
@Api(value = "测试接口", tags = "用户管理相关的接口", description = "用户测试接口")
@ResponseBody
@RestController
public class HelloController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String sayHello() {
        return "index";
    }
}