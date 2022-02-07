package com.ylesb.middleware.mybatis;
/**
 * @title: SqlSession
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/79:52
 */

import java.util.List;

/**
 * @className    : SqlSession
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/7 9:52]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/7 9:52]
 * @updateRemark : [描述说明本次修改内容] 
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}

