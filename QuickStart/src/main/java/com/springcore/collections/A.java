package com.springcore.collections;

public class A {
	int x;
	B ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	public A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
