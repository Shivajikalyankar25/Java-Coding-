package Conditions_loops;

import java.util.Scanner;

public class Lab_40_conditions {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("ENter your Age");
		int age =  scan.nextInt();
		
		if (age>=18) {
			System.out.println("you are allowed to Vote");
		}
		else {
			System.out.println("You are not allowed to Vote");
		}
	}

}
