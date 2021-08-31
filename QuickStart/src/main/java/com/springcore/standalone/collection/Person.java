package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,Integer> courses;
	private Properties properties;

	public Person(List<String> friends, Map<String, Integer> courses, Properties properties) {
		super();
		this.friends = friends;
		this.courses = courses;
		this.properties = properties;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	
	

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courses=" + courses + ", properties=" + properties + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
