package com.melih.designpatterns.proxy;

public class EFTServiceProxyInjector implements ServiceProxyInjector {

	@Override
	public Consumer getConsumer() {
		return new MoneyTransferApp(new EFTServiceProxy(new EFTServiceImpl()));
	}
}
