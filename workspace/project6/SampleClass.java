package project6;

import java.lang.reflect.*;

public class SampleClass {
	private final int pr_data = 9;
	private String pr_str;
	public static int pu_data;

	private SampleClass() {
		// some code
	}

	public SampleClass(int pr_data_, String pr_str_) {
		pr_str = pr_str_;
	}

	public SampleClass(SampleClass tObj) {
		this.pr_str = tObj.pr_str;
	}

	private boolean isValid() {
		// some code
		return true;
	}

	public int get_pr_data() {
		return pr_data;
	}

	public String get_pr_str() {
		return pr_str;
	}
}

// class FClass {
// public static void main(String[] args) throws ClassNotFoundException {
// Class c = Class.forName("project6.SampleClass");
// // ________________________________________ //Line 1
// Constructor[] my_const = c.getDeclaredConstructors();
// System.out.println(my_const.length); // Line 2
// }
// }

class FClass {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("project6.SampleClass");
		Field[] fields1 = c.getFields();
		Field[] fields2 = c.getDeclaredFields();
		for (Field f : fields1) {
			System.out.println(f.getName() + " : ");
			System.out.println(f.getType());
			System.out.println();
			System.out.println("Modifier: " +
					Modifier.toString(f.getModifiers()));

		}
		System.out.println("------------------------------------");
		for (Field f : fields2) {
			System.out.println(f.getName() + " : ");
			System.out.println(f.getType());
			System.out.println();
			System.out.println("Modifier: " +
					Modifier.toString(f.getModifiers()));

		}
	}
}