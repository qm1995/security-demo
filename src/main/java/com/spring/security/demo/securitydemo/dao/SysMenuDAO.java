package com.spring.security.demo.securitydemo.dao;

import com.spring.security.demo.securitydemo.mode.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qiumin
 * @create 2019/1/13 13:14
 * @desc
 **/
public interface SysMenuDAO extends JpaRepository<SysMenu,Integer> {
}
