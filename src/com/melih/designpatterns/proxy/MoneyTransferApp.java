package com.melih.designpatterns.proxy;

import java.math.BigDecimal;

import com.melih.designpatterns.proxy.Consumer;

public class MoneyTransferApp implements Consumer {

	private EFTServiceProxy proxy;

	public MoneyTransferApp(EFTServiceProxy proxy) {
		this.proxy = proxy;
	}

	@Override
	public void transferMoney(String from, String to, BigDecimal amount) {
		this.proxy.transferMoney(from, to, amount);
	}
}
