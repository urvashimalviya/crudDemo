package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Example [name=" + name + "]";
	}

	public Example(String name) {
		super();
		this.name = name;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start(){
		System.out.println("Starting   .......");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Ending.......");
	}

}
