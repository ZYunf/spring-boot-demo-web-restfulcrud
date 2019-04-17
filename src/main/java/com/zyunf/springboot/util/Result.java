package com.zyunf.springboot.util;

/**
 * @Author: Yunf
 * @Date: 2019/4/15 2:23
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.util
 */
public class Result {
    //返回结果是否成功
    private boolean sucess;
    //返回的信息
    private String message;

    public Result(boolean sucess, String message) {
        this.sucess = sucess;
        this.message = message;
    }

    public boolean isSucess() {
        return sucess;
    }

    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
