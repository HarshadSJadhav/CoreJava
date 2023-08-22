package myproject;

import java.util.Scanner;

public class Maths_User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter Second number ");
		int b=sc.nextInt();
		System.out.println("the sum is "+(a+b));
		System.out.println("the Division is "+(a/b));
		System.out.println("the Multiplication is "+(a*b));
		System.out.println("the difference is "+(a-b));

	}

}
