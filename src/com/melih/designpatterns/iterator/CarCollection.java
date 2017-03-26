package com.melih.designpatterns.iterator;

public interface CarCollection extends Iterable<Car> {
	public void addCar(Car car);

	public void removeCar(Car car);
}
