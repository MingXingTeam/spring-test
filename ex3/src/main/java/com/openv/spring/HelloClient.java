package com.openv.spring;

import org.aopalliance.aop.Advice;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 手工创建AOP代理
 * @author maomao
 *
 */
public class HelloClient {
	protected static final Log log = LogFactory.getLog(HelloClient.class);
	public static void main(String args[]){
		Advice advice = new LoggingAroundAdvice();
		ProxyFactory factory = new ProxyFactory(new HelloWorld());
        factory.addAdvice(advice);
        IHelloWorld hw = (IHelloWorld) factory.getProxy();
        log.info(hw.getContent("luoshifei"));
	}
}
