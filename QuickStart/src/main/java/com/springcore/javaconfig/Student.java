package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private Pencil pencil;

	public Student(Pencil pencil) {
		super();
		this.pencil = pencil;
	}

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}

	public void study() {
		this.pencil.ink();
		System.out.println("Study Hard for exams");
	}

}
