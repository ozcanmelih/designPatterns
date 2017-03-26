package com.melih.designpatterns.di.modern;

public class SMSServiceImpl implements MessagingService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("SMS sent to " + receiver + " with Message = " + message);
	}
}
