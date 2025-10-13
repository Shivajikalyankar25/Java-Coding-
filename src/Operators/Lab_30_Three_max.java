package Operators;

public class Lab_30_Three_max {
	public static void main(String[] args) {
		int a = 3;
		int b =5;
		int c = 10;
		
		int max = a>b ? (a>c?a:c): (b>c?b:c);
		System.out.println(max);
	}

}
