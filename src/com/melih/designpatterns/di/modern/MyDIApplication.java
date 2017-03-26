package com.melih.designpatterns.di.modern;

public class MyDIApplication implements Consumer {

	private MessagingService service;

	public MyDIApplication(MessagingService service) {
		this.service = service;
	}

	@Override
	public void processMessage(String msg, String rec) {
		this.service.sendMessage(msg, rec);
	}
}
