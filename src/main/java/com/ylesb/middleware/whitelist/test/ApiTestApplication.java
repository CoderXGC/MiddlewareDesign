package com.ylesb.middleware.whitelist.test;
/**
 * @title: ApiTestApplication
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/119:59
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @className    : ApiTestApplication
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/1 19:59]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/1 19:59]
 * @updateRemark : [描述说明本次修改内容] 
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.ylesb.middleware.*"})
public class ApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }

}
