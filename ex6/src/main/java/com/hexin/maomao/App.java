package com.hexin.maomao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//启用Profile
//		System.setProperty("spring.profiles.active","development");
//        //读取spring的配置文件
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-config-all.xml");
//		
//		Person person =  (Person)ctx.getBean("person");
//        System.out.println("Person: "+person);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(); 
		ctx.getEnvironment().setActiveProfiles("development");
		ctx.register(SpringConfig.class); 
		ctx.refresh();
    	//获得实例对象
        Person person =  (Person)ctx.getBean("person");
        System.out.println("Person: "+person);
	}

}
