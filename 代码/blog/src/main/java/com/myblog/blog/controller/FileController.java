package com.myblog.blog.controller;

import com.myblog.blog.service.FileService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * .
 *
 * @author : 阿福
 * @version :1.0  2021/9/20 0020 2021/9/20 0020
 * @project: com.myblog.blog.controller blog
 * @date : 2021/9/20 0020 20:55
 * @description :TODO
 */
@Api(value = "文件管理接口", tags = "文件管理相关的接口", description = "文件管理接口")
@Controller
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String file() {
        return "file";
    }


}
