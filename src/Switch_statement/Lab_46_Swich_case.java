package Switch_statement;

import java.util.Scanner;

public class Lab_46_Swich_case {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter browser name to execute");
		String browser = scan.next();
		
		switch (browser) {
		case "chrome":
			System.out.println("Starting chrome Browser");
			System.out.println("..............");
			System.out.println("Chrome Browser Started");
			break;
		case "firefox":
			System.out.println("Starting firefox Browser");
			System.out.println("..............");
			System.out.println("firefox Browser Started");
			break;
			
		case "edge":
			System.out.println("Starting edge Browser");
			System.out.println("..............");
			System.out.println("Chrome edge Started");
			break;
		default :
			System.out.println("Please enter the correct browser name");
		}
		
	}

}
