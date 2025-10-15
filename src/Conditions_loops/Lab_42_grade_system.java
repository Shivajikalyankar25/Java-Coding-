package Conditions_loops;

import java.util.Scanner;

public class Lab_42_grade_system {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Score");
		
		int score = scan.nextInt();
		
		if(score>=90 && score<=100) {
			System.out.println("Grade is= " + "A");
		}
		else if (score>=80 && score<=89) {
			System.out.println("Grade " + "B");
		}
		else if (score>=70 && score<=79) {
			System.out.println("Grade " + "C");
		}
		else if (score>=60 && score<=69) {
			System.out.println("Grade " + "D");
		}
		else if (score>=50 && score<=59) {
			System.out.println("Grade " + "E");
		}
		else if (score<=40 && score>49) {
			System.out.println("Grade" + "F");
		}
		else if (score<=0 || score>=101) {
			System.out.println("Grade" + "Worng value");
		}
		else if (score<=30 && score>0) {
			System.out.println("Grade" + "Fail");
		}
	}

}
