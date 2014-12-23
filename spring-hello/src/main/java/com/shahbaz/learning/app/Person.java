package com.shahbaz.learning.app;

public class Person {

	private static String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Person.name = name;
	}

	@Override
	public String toString() {
		return "Person "+name;
	}

	

}
