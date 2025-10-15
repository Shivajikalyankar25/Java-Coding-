package Conditions_loops;

import java.util.Scanner;

public class Lab_41_Odd_or_even {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter you number");
		int age = scn.nextInt();
	//	int num = 19;
		
		if(age%2 == 0) {
			System.out.println("The given Number id Even");
		}
		else {
			System.out.println("The given Number is ODD Number");
		}
		
		scn.close(); //stop the scanner
	}

}
