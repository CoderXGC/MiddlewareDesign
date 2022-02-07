package com.ylesb.middleware.mybatis.test.dao;


import com.ylesb.middleware.mybatis.test.po.User;

public interface IUserDao {

     User queryUserInfoById(Long id);

}
