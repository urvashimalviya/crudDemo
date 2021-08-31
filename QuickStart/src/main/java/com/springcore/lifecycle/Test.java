package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lc-config.xml");
		/*Salsa s1=(Salsa)context.getBean("salsa");
		System.out.println(s1);
		//	context.registerShutdownHook();
	
		
		System.out.println("********");
		Coco c1=(Coco)context.getBean("coco");
		System.out.println(c1);
		
		context.registerShutdownHook();*/
		
		
		Example e1=(Example)context.getBean("example");
		System.out.println(e1);
		
		context.registerShutdownHook();
		
	}

}
