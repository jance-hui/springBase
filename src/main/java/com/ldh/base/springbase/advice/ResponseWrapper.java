package com.ldh.base.springbase.advice;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * 统一返回结构
 *
 * @author jance-hui
 * @create 2019-12-04 上午10:10
 **/
public class ResponseWrapper<T> implements Serializable {
    private T body;
    private int code;
    private String errMsg;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public ResponseWrapper() {
    }

    public ResponseWrapper(T body) {
        this.body = body;
        this.code = HttpStatus.OK.value();
    }
    public ResponseWrapper(T body,int errCode,String errMsg) {
        this.body = body;
        this.code = errCode;
        this.errMsg = errMsg;
    }

    public static <p> ResponseWrapper<p> getBodyWrapper(p body){
        return new ResponseWrapper<p>(body);
    }
    public static <p> ResponseWrapper<p> getBodyWrapper(p body,int errCode,String errMsg){
        return new ResponseWrapper<p>(body,errCode,errMsg);
    }
}
