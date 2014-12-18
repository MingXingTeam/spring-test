package com.openv.spring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;

public class HelloWorldClient {
	protected static final Log log = LogFactory.getLog(HelloWorldClient.class);

//    public HelloWorldClient() {
//        Resource resource = new ClassPathResource("spring/application-config.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        HelloWorld hw = (HelloWorld) factory.getBean("fileHelloWorld");
//        log.info(hw.getContent());
//    }

    /**
     * 基于文件找	
     */
//    public HelloWorldClient() {
//    	try{
//	        InputStream ins = new FileInputStream("spring/application-config.xml");
//	        BeanFactory factory = new XmlBeanFactory((Resource) ins);
//	        HelloWorld hw = (HelloWorld)factory.getBean("fileHelloWorld");
//	        log.info(hw.getContent());
//    	}catch(FileNotFoundException ex){
//    		log.error("文件未找到",ex);
//    	}
//    }}
    
    public HelloWorldClient(){
    	
    	
    }
	
    public static void main(String[] args) {
        new HelloWorldClient();
    }
}
