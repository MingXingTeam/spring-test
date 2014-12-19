package com.openv.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggingAroundAdvice implements MethodInterceptor {
	protected static final Log log = LogFactory.getLog(LoggingAroundAdvice.class);
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		log.info("before:调用getContent()方法前");
        invocation.getArguments()[0] = "luoshifei";
        invocation.proceed();
        log.info("after:调用getContent()方法后");

        return null;
	}

}
