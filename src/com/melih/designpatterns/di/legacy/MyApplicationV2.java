package com.melih.designpatterns.di.legacy;

public class MyApplicationV2 {

	private EmailService emailService;

	/*
	 * in this case, we are asking client applications or test classes to
	 * initializing the email service that is not a good design decision.
	 */
	public MyApplicationV2(EmailService emailService) {
		this.emailService = emailService;
	}

	public void processMessage(String msg, String rec) {
		this.emailService.sendMail(msg, rec);
	}
}
