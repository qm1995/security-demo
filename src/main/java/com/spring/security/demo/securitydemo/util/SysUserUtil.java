package com.spring.security.demo.securitydemo.util;

import com.spring.security.demo.securitydemo.mode.SysUser;
import org.springframework.security.core.context.SecurityContextHolder;
import sun.plugin.liveconnect.SecurityContextHelper;

/**
 * @author qiumin
 * @create 2019/1/13 13:00
 * @desc
 **/
public class SysUserUtil {

    /**
     * 获取用户信息
     * @return
     */
    public static Object getUser(){
        return  SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
