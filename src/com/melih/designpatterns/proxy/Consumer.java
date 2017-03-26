package com.melih.designpatterns.proxy;

import java.math.BigDecimal;

public interface Consumer {
	public void transferMoney(String from, String to, BigDecimal amount);
}
