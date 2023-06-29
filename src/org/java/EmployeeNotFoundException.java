package org.java;

public class EmployeeNotFoundException extends Exception {

	@Override
	public String getMessage() {

		String s = "Employee Not In Unit1";

		return s;
	}

}
