package com.melih.designpatterns.di.legacy;

public class MyLegacyTest {

	public static void main(String[] args) {
		MyApplication myApplication = new MyApplication();
		myApplication.processMessage("Hi Melih", "melih.ozcan89@gmail.com");
		
		MyApplicationV2 myApplicationV2 = new MyApplicationV2(new EmailService());
		myApplicationV2.processMessage("Hi Melih", "melih.ozcan89@gmail.com");
	}
}
