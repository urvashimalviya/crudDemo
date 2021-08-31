package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autowire-config.xml");
		Employee e1 = context.getBean("emp", Employee.class);
		System.out.println(e1);
		
		
		
		
	}

}
