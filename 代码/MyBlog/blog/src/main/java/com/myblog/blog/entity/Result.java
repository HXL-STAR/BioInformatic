package com.myblog.blog.entity;

import lombok.Data;

/**
 * .
 *
 * @author : 阿福
 * @version :TODO  2021/9/21 0021 10:53
 * @project: com.myblog.blog.entity blog
 * @description :TODO
 */
@Data
public class Result {
    private boolean flag;
    private Integer code;
    private String message;
    private Object data;


}
