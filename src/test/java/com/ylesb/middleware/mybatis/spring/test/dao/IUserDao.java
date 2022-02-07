package com.ylesb.middleware.mybatis.spring.test.dao;


import com.ylesb.middleware.mybatis.spring.test.po.User;

public interface IUserDao {

     User queryUserInfoById(Long id);

}
