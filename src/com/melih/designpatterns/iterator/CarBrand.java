package com.melih.designpatterns.iterator;

public enum CarBrand {

	AUDI("Audi"), BMW("Bmw"), MERCEDES("Mercedes-Benz");

	private String name;

	private CarBrand(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
