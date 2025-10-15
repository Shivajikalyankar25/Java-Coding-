package Switch_statement;

import java.util.Scanner;

public class Lab_45_Switch_condition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day Number(1-7");
		int day = scan.nextInt();
		
		switch(day) {
		case 1:
		System.out.println("its Monday");
		break;
		case 2:
			System.out.println("its Monday");
			break;
		case 3:
			System.out.println("its Tuesday");
			break;
		case 4:
			System.out.println("its Wednesday");
			break;
		case 5:
			System.out.println("its Thursday");
			break;
		case 6:
			System.out.println("its Friday");
			break;
		case 7:
			System.out.println("its Saturday");
			break;
		default:
			System.out.println("wrong Number");
		}
		
	}

}
