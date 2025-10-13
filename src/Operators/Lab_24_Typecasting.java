package Operators;

public class Lab_24_Typecasting {
	public static void main(String[] args) {
		//GST - 18.45
		int course = 100;
		float GST = 18.45f;
		int total = course + (int)GST ;  // narrow explicit not possible
		float total1 = course + GST ; //widening implicit automatically 
		System.out.println(total);
		System.out.println(total1);
	}

}
