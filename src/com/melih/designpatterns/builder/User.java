package com.melih.designpatterns.builder;

public class User {

	private String name;
	private String lastName;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private User(UserBuilder userBuilder) {
		this.name = userBuilder.getName();
		this.lastName = userBuilder.getLastName();
		this.age = userBuilder.getAge();
	}

	public static UserBuilder builder() {
		return new UserBuilder();
	}

	@Override
	public String toString() {
		return age + " " + name + " " + lastName;
	}

	public static class UserBuilder {
		private String name;
		private String lastName;
		private int age;

		public UserBuilder name(String name) {
			this.name = name;
			return this;
		}

		public User build() {
			return new User(this);
		}

		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		private String getName() {
			return name;
		}

		private String getLastName() {
			return lastName;
		}

		private int getAge() {
			return age;
		}
	}
}
