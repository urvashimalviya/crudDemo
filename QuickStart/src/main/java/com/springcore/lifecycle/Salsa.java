package com.springcore.lifecycle;

public class Salsa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Salsa [price=" + price + "]";
	}

	public Salsa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void hey() {
		System.out.println("Init method hey");
	}

	public void bye() {
		System.out.println("Destroy method bye");
	}

}
