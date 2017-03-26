package com.melih.designpatterns.proxy;

import java.math.BigDecimal;

public class EFTServiceProxy implements EFTService {

	private EFTService service;

	public EFTServiceProxy(EFTService service) {
		this.service = service;
	}

	@Override
	public void transferMoney(String from, String to, BigDecimal amount) {
		System.out.println("Money transfer is starting. From: " + from + " To: " + to + " Amount: " + amount);
		this.service.transferMoney(from, to, amount);
		System.out.println("Money has been transferred. From: " + from + " To: " + to + " Amount: " + amount);
	}

}
