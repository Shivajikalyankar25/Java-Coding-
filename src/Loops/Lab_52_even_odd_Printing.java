package Loops;

public class Lab_52_even_odd_Printing {
	public static void main(String[] args) {
		System.out.println("Start of programe");
		int i =0;
		
		for ( ; i<=10; i++) {
			if(i%2==0) {
				System.out.println("Even Number : " + i);
			} else {
				System.out.println("Odd Number : " + i);
			}
		}
		System.out.println("end");
	}

}
