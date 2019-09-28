package com.melih.designpatterns.builder;

public class BuilderTest {

	public static void main(String[] args) {
		User user = User.builder().name("Melih").lastName("Özcan").age(29).build();
		System.out.println(user);
	}
}
