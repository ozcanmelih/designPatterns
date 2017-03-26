package com.melih.designpatterns.singleton;

import java.util.Date;

public class SingletonDate {

	private SingletonDate singletonDate;
	private Date date;

	private SingletonDate() {
		this.date = new Date();
	}

	public SingletonDate getInstance() {
		if (singletonDate == null) {
			singletonDate = new SingletonDate();
		}

		return singletonDate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
