package org.java;

public class ConstParent extends Constructor1{

	public ConstParent() {

		super("Suriya");
		System.out.println("Non Para");

	}
	
	public static void main(String[] args) {
		ConstParent c = new ConstParent();

	}

}
