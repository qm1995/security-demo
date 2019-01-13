package com.spring.security.demo.securitydemo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

/**
 * @author qiumin
 * @create 2019/1/13 14:37
 * @desc
 **/
public class JsonUtil {

    public static String beanToStr(Object bean){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(bean);
        } catch (JsonProcessingException e) {
            //
        }
        return "";
    }
}
