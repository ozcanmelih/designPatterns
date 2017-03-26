package com.melih.designpatterns.singleton;

import java.util.Date;

public class SingletonDateThreadSafe {

	private SingletonDateThreadSafe singletonDate;
	private Date date;

	private SingletonDateThreadSafe() {
		this.date = new Date();
	}

	public SingletonDateThreadSafe getInstance() {
		if (singletonDate == null) {
			synchronized (SingletonDateThreadSafe.class) {
				if (singletonDate == null) {
					singletonDate = new SingletonDateThreadSafe();
				}
			}
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
