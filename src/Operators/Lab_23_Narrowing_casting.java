package Operators;

public class Lab_23_Narrowing_casting {
	public static void main(String[] args) {
		int val = 340;
		
//		byte b = val;  // implicit in narrowing in not possible
		byte b = (byte)val; 
		System.out.println(b);
		// Explicit is possible in narrowing but it will leads to get data loss
	}

}
