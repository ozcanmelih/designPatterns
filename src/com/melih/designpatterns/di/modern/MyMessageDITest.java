package com.melih.designpatterns.di.modern;

/*
 * 1) Service components should be designed with base class or interface. It’s better to prefer interfaces or abstract classes that would define contract for the services.
 * 2) Consumer classes should be written in terms of service interface.
 * 3) Injector classes that will initialize the services and then the consumer classes.
 * */
public class MyMessageDITest {

	public static void main(String[] args) {
		String message = "Hi Melih";
		String email = "melih.ozcan89@gmail.com";
		String phone = "905326605280";

		new EmailServiceInjector().getConsumer().processMessage(message, email);
		new SMSServiceInjector().getConsumer().processMessage(message, phone);
	}
}
