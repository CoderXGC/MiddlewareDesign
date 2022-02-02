package com.ylesb.middleware.hystrix.value;
/**
 * @title: IValveService
 * @projectName MiddlewareDesign
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/2/29:31
 */

import com.ylesb.middleware.hystrix.annotation.DoHystrix;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * @className    : IValveService
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/2/2 9:31]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/2/2 9:31]
 * @updateRemark : [描述说明本次修改内容] 
 */

public interface IValveService {

    Object access(ProceedingJoinPoint jp, Method method, DoHystrix doHystrix, Object[] args) throws Throwable;

}

