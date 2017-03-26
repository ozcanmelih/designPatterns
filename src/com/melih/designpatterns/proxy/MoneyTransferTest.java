package com.melih.designpatterns.proxy;

import java.math.BigDecimal;

public class MoneyTransferTest {

	public static void main(String[] args) {
		Consumer consumer = new EFTServiceProxyInjector().getConsumer();
		consumer.transferMoney("Bill GATES", "Ahmet Melih ÖZCAN", new BigDecimal("10000000000"));
	}
}
