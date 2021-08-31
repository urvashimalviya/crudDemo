package com.springcore.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("Urvashi")
	private String name;
	@Value("Norway")
	private String city;
	@Value("#{temp}")
	private List<String> familyName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	public List<String> getFamilyName() {
		return familyName;
	}

	public void setFamilyName(List<String> familyName) {
		this.familyName = familyName;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", familyName=" + familyName + "]";
	}

	public Student(String name, String city, List<String> familyName) {
		super();
		this.name = name;
		this.city = city;
		this.familyName = familyName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
