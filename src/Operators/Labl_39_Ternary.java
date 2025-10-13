package Operators;

public class Labl_39_Ternary {
	public static void main(String[] args) {
		int age = 92;
		
		String result = (age<=18)? "minor": ((age<70)?"Adult":"Senior");
		
		System.out.println(result);
		
	
	}

}
