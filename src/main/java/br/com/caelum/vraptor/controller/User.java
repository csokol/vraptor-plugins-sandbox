package br.com.caelum.vraptor.controller;

import java.util.Calendar;

public class User {
	private String name;
	private Calendar birthDay;

	public User(String name, Calendar birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", birthDay=" + birthDay.getTime() +
				'}';
	}
}
