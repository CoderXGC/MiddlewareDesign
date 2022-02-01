package com.ylesb.middleware.whitelist.config;
/**
 * @title: WhiteListProperties
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/117:04
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className    : WhiteListProperties
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/1 17:04]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/1 17:04]
 * @updateRemark : [描述说明本次修改内容] 
 */
@ConfigurationProperties("bugstack.whitelist")
public class WhiteListProperties {

    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
