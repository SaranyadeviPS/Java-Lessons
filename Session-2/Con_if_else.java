package sample;

import java.util.Scanner;

public class Con_if_else {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(18<age) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not Eligible to vote");
		}
	}
}
