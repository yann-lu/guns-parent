/**
 * Copyright (c) 2019-2019 All Rights Reserved.
 */
package com.stylefeng.guns.rest.modular.vo;

/**
 * @author 陆炎
 * @version : ResponseVO.java, v0.1 2019/10/27 陆炎 Exp $$
 */
public class ResponseVO<M> {
    //返回状态 [0-成功 1-失败 999-系统异常]
    private int status;
    //返回信息
    private String msg;

    private M data;

    private ResponseVO(){}

    public static<M> ResponseVO success(M m){
        ResponseVO<M> responseVO = new ResponseVO<>();
        responseVO.setStatus(0);
        responseVO.setData(m);
        return responseVO;
    }

    public static<M> ResponseVO serviceFail(String msg){
        ResponseVO<M> responseVO = new ResponseVO<>();
        responseVO.setStatus(1);
        responseVO.setMsg(msg);
        return responseVO;
    }

    public static<M> ResponseVO appFail(String msg){
        ResponseVO<M> responseVO = new ResponseVO<>();
        responseVO.setStatus(999);
        responseVO.setMsg(msg);
        return responseVO;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public M getData() {
        return data;
    }

    public void setData(M data) {
        this.data = data;
    }
}