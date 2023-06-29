package org.java;

public class Exception1 {

	public void test() {

		String id = "123";
		if (id.equals("1234")) {

			System.out.println("Employee Not presednt");
		} else {

			try {
				throw new EmployeeNotFoundException();
			} catch (Exception e) {

				System.out.println("NOT");
				e.printStackTrace();

			} finally {
				System.out.println("Database Closed");
			}
			
			
		}

	}

	public static void main(String[] args) throws EmployeeNotFoundException {

		Exception1 e = new Exception1();
		e.test();
	}
}
