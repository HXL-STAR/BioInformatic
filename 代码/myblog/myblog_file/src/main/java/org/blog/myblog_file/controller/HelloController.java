package org.blog.myblog_file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * .
 *
 * @author : 阿福
 * @version :TODO  2021/9/24 0024 19:33
 * @project: org.blog.myblog_file.controller myblog_file
 * @description :TODO
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String sayHello() {
        return "index";
    }


}
