package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereo/stereo-config.xml");
		Student s1 = con.getBean("ob", Student.class);
		System.out.println(s1);
		
		System.out.println(s1.getFamilyName().getClass().getName());
	}

}
