package com.melih.designpatterns.iterator;

import java.util.Iterator;

public class IteratorPatternTest {
	
	private static CarCollection populateCars(){
		
		CarCollection carCollection = new CarCollectionImpl();
		carCollection.addCar(new Car("RS6", CarBrand.AUDI));
		carCollection.addCar(new Car("e63s AMG 4matic+", CarBrand.MERCEDES));
		carCollection.addCar(new Car("m4 GTS", CarBrand.BMW));
		carCollection.addCar(new Car("AMG GTR", CarBrand.MERCEDES));
		carCollection.addCar(new Car("R8 v10+", CarBrand.AUDI));
		carCollection.addCar(new Car("m5", CarBrand.BMW));
		
		return carCollection;
	}
	
	public static void main(String[] args) {
		CarCollection carCollection = populateCars();
		Iterator<Car> iterator = carCollection.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			System.out.println(car.getBrand().getName() + " " + car.getModel());
		}
	}
}
