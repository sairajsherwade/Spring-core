package com.jsp.beanfactory;

public class Pen {
	
	
	private String brand;
	private String colour;
	private int price;
	
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	Pen (){
		System.out.println("pen object is crated by spring ");
		
	}
	
	
	public void write() {
		
		System.out.println("pen write so smooth");
	}

}
