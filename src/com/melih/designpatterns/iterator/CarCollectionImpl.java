package com.melih.designpatterns.iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CarCollectionImpl implements CarCollection {

	private List<Car> carList;
	
	public CarCollectionImpl() {
		this.carList = new ArrayList<Car>();
	}

	@Override
	public Iterator<Car> iterator() {
		return new CarIterator(this.carList);
	}

	@Override
	public void addCar(Car car) {
		carList.add(car);
	}

	@Override
	public void removeCar(Car car) {
		carList.remove(car);
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	private class CarIterator implements Iterator<Car> {

		private List<Car> cars;
		private int position;

		public CarIterator(List<Car> cars) {
			this.cars = cars;
		}

		@Override
		public boolean hasNext() {
			return position < cars.size();
		}

		@Override
		public Car next() {
			if (position > cars.size()) {
				return null;
			}
			return cars.get(position++);
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
		}
	}
}
