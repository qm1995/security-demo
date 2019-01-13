package com.spring.security.demo.securitydemo.controller;

import com.spring.security.demo.securitydemo.dao.SysMenuDAO;
import com.spring.security.demo.securitydemo.dao.SysUserDAO;
import com.spring.security.demo.securitydemo.mode.SysMenu;
import com.spring.security.demo.securitydemo.mode.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qiumin
 * @create 2019/1/12 18:30
 * @desc
 **/
@RestController
public class DemoController {

    @Autowired
    private SysMenuDAO sysMenuDAO;

    @Autowired
    private SysUserDAO userDAO;


    @RequestMapping("/errors")
    public String error() {
        System.out.println("未登录");
        return "未登录";

    }

    @RequestMapping("/login")
    public String login(String username, String password) {
        System.out.println("username=" + username + ",password=" + password);
        return "登录页面";
    }

    @RequestMapping("/success")
    public String success() {
        System.out.println("登录成功");
        return "登录成功";
    }

    /**
     * 获取所有菜单
     *
     * @return
     */
    @RequestMapping(value = "/menu/list")
    public List<SysMenu> getMenu() {
        List<SysMenu> all = sysMenuDAO.findAll();
        return all;
    }

    /**
     * 获取所有用户
     * @return
     */
    @RequestMapping(value = "/user/list")
    public List<SysUser> getUser(){
        List<SysUser> all = userDAO.findAll();
        return all;
    }
}
