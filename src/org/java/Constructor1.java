package org.java;

public class Constructor1 {

	public Constructor1(String name) {

		this(123);
		System.out.println("Para Const " + name);

	}

	public Constructor1(int id) {

		System.out.println("Para Const = " + id);

	}

}
