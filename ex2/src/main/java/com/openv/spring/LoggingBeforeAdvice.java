/*
 * Created on 2004-11-4
 *
 * http://www.open-v.com �ṩ�����ά������
 */
package com.openv.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
/**
 * 构造
 * @author maomao
 *
 */
public class LoggingBeforeAdvice implements MethodBeforeAdvice {
    protected static final Log log = LogFactory.getLog(LoggingBeforeAdvice.class);

    public void before(Method arg0, Object[] arg1, Object arg2)
        throws Throwable {
        log.info("调用getContent方法之前执行的方法");
    }
}
