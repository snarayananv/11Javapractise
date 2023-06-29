package org.java;

public class ExcepTest {
	
	public void find() throws EmployeeNotFoundException {
		
		throw new EmployeeNotFoundException();
		
	}
	public static void main(String[] args) throws EmployeeNotFoundException {
		
		ExcepTest e = new ExcepTest();
		e.find();
	}

}
