package com.ylesb.whitelist.annotation;
/**
 * @title: DoWhiteList
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/117:03
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @className    : DoWhiteList
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/1 17:03]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/1 17:03]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoWhiteList {

    String key() default "";

    String returnJson() default "";
}

