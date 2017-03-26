package com.melih.designpatterns.proxy;

import java.math.BigDecimal;

public class EFTServiceImpl implements EFTService {

	@Override
	public void transferMoney(String from, String to, BigDecimal amount) {
		System.out.println(
				"Money is being transferred to " + to + " account from " + from + " account. Amount = " + amount);
	}
}
