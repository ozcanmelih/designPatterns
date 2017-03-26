package com.melih.designpatterns.iterator;

public class Car {
	private String model;
	private CarBrand brand;

	public Car() {
	}

	public Car(String name, CarBrand brand) {
		this.model = name;
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public CarBrand getBrand() {
		return brand;
	}

	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}
}
