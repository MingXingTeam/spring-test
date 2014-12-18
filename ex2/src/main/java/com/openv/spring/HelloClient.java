/*
 * Created on 2004-10-16
 *
 * http://www.open-v.com �ṩ�����ά������
 */
package com.openv.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloClient {
    protected static final Log log = LogFactory.getLog(HelloClient.class);

    public static void main(String[] args) throws Exception {
        Resource resource = new ClassPathResource("spring/application-config.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        IHelloWorld hw = (IHelloWorld) factory.getBean("helloworldbean");
        log.info(hw.getContent("哈哈"));
    }
}
