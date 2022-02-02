package com.ylesb.middleware.test.controller;
/**
 * @title: UserController
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/119:17
 */
import com.ylesb.middleware.hystrix.annotation.DoHystrix;
import com.ylesb.middleware.whitelist.annotation.DoWhiteList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className    : UserController
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/1 19:17]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/1 19:17]
 * @updateRemark : [描述说明本次修改内容] 
 */


@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 通过：http://localhost:8081/api/queryUserInfo?userId=aaa
     * 拦截：http://localhost:8081/api/queryUserInfo?userId=123
     */
    @DoWhiteList(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfoWhiteList", method = RequestMethod.GET)
    public UserInfo queryUserInfoWhiteList(@RequestParam String userId) {
        logger.info("查询用户信息，userId：{}", userId);
        return new UserInfo("虫虫:" + userId, 19, "天津市东丽区万科赏溪苑14-0000");
    }
    /**
     * 测试：http://localhost:8081/api/queryUserInfo?userId=aaa
     */
    @DoHystrix(timeoutValue = 350, returnJson = "{\"code\":\"1111\",\"info\":\"调用方法超过350毫秒，熔断返回！\"}")
    @RequestMapping(path = "/api/queryUserInfoHystrix", method = RequestMethod.GET)
    public UserInfo queryUserInfoHystrix(@RequestParam String userId) throws InterruptedException {
        logger.info("查询用户信息，userId：{}", userId);
        Thread.sleep(1000);
        return new UserInfo("虫虫:" + userId, 19, "天津市东丽区万科赏溪苑14-0000");
    }

}
