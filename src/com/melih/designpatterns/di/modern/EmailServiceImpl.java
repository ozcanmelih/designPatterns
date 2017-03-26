package com.melih.designpatterns.di.modern;

public class EmailServiceImpl implements MessagingService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("Email sent to " + receiver + " with Message = " + message);
	}
}
