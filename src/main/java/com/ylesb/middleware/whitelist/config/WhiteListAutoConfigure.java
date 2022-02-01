package com.ylesb.middleware.whitelist.config;
/**
 * @title: WhiteListAutoConfigure
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/117:04
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className    : WhiteListAutoConfigure
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/1 17:04]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/1 17:04]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Configuration
@ConditionalOnClass(WhiteListProperties.class)
@EnableConfigurationProperties(WhiteListProperties.class)
public class WhiteListAutoConfigure {
    @Bean("whiteListConfig")
    @ConditionalOnMissingBean
    public String whiteListConfig(WhiteListProperties properties) {
        return properties.getUsers();
    }
}
