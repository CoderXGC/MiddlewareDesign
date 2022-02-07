package com.ylesb.middleware.mybatis;
/**
 * @title: Configuration
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/79:51
 */

import java.sql.Connection;
import java.util.Map;

/**
 * @className    : Configuration
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/7 9:51]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/7 9:51]
 * @updateRemark : [描述说明本次修改内容] 
 */

public class Configuration {
    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }

}
