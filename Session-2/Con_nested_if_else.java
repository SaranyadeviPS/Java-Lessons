package sample;

import java.util.Scanner;

public class Con_nested_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your weight:");
		int weight = sc.nextInt();
		
		if(age>20) {
			if(weight>50) {
				System.out.println("Your age and your weight are Satisfied,you can donate your blood");
			}
			else {
				System.out.println("Your age is satisfied but your weight is didn't Satisfied, you can not donate your blood");
			}
		}
		else {
			System.out.println("Your age and your weight are didn't Satisfied, you can not donate your blood");
		}
	}
}
