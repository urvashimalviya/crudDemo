package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Pencil getPencil(){
		return new Pencil();
	}
	
	
	@Bean
	public Student getStudent(){
		Student s1=new Student(getPencil());
		return s1;
	}
}
