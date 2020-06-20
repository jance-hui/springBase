package com.ldh.base.springbase.advice;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 返回值的advice，将返回值放到httprequest里，其他的intercept就可以获取到
 * @author chaocie3240
 * @create 2019-11-28 下午3:41
 **/
@ControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice<Object> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResponseAdvice.class);
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        String controllerClassName= returnType.getMethod().getDeclaringClass().getName();
        String methodName=returnType.getMethod().getName();
        LOGGER.info("响应报文=>{}", JSON.toJSONString(body));
        LOGGER.info("退出<--- {}#{}", controllerClassName, methodName);
        ServletServerHttpRequest req=(ServletServerHttpRequest)request;
        HttpServletRequest servletRequest = req.getServletRequest();
        if(body instanceof ResponseWrapper){
            servletRequest.setAttribute("response", body);
            return body;
        }
        servletRequest.setAttribute("response", ResponseWrapper.getBodyWrapper(body));
        return ResponseWrapper.getBodyWrapper(body);
    }
    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(Exception ex) {
        LOGGER.error("程序运行异常：",ex);
//        return new ResponseEntity<Object>(ResponseWrapper.getBodyWrapper("fail","S030","服务运行异常"), HttpStatus.INTERNAL_SERVER_ERROR);
        return ResponseWrapper.getBodyWrapper("error",HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage());
    }

}
