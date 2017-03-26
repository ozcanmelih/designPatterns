package com.melih.designpatterns.proxy;

import java.math.BigDecimal;

public interface EFTService {
	public void transferMoney(String from, String to, BigDecimal amount);
}
