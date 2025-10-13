package Operators;

public class Lab_31_Ternary_operator {
	public static void main(String[] args) {
		int age = 90 ;
		
		String result = age<= 18 ?"You are minor":(age<65?"Adult":"Senior citizen");
		System.out.println(result);
	}

}
