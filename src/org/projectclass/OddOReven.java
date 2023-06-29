package org.projectclass;

public class OddOReven {

	public void reverseString() {

		String s = "welcome";
		String rev = " ";

		for (int i = s.length() - 1; i >= 0; i--) {

			char charAt = s.charAt(i);
			rev = rev + charAt;

		}

		System.out.println(rev);

	}

	public static void main(String[] args) {
		OddOReven o = new OddOReven();
		o.reverseString();
	}

}
