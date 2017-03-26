package com.melih.designpatterns.di.legacy;

public class EmailService {

	public void sendMail(String message, String receiver) {
		System.out.println("Email sent to " + receiver + " with Message = " + message);
	}
}
