package com.melih.designpatterns.di.modern;

/*
 * We are not required to have base interfaces for consumer classes but I will have a Consumer interface declaring contract for consumer classes.
 * */
public interface Consumer {
	void processMessage(String msg, String rec);
}
