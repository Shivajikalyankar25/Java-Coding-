package Loops;

import java.util.Iterator;

public class Lab_50_odd_even {
	public static void main(String[] args) {
		//print even number from 1 to 50
		for(int i=0; i<=50;i++) {
			if(i%2==0) {
				System.out.println("Even --> " +i);
			}else {
				System.out.println("Odd Number -- > " + i);
			}
		}
	}

}
