package com.ylesb.middleware.mybatis;
/**
 * @title: DefaultSqlSessionFactory
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/79:53
 */

/**
 * @className    : DefaultSqlSessionFactory
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/7 9:53]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/7 9:53]
 * @updateRemark : [描述说明本次修改内容] 
 */

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.connection, configuration.mapperElement);
    }

}

