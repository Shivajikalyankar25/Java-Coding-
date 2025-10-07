package Operators;

public class Lab_22_Type_cast {
	public static void main(String[] args) {
		// convert value from one data type to another type
		// 1. Widening
		// 2. Narrowing
		byte b = 10;
		int a = b;
		int a1 = (int)b;
		System.out.println(a);  //implicit
		System.out.println(a1); // Explicit
		//byte into int valid compiler doing widening JVM
	}

}
