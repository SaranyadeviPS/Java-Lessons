package sample;

import java.util.Scanner;

public class Personalinfo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your mobile number:");
	int mob = sc.nextInt();
	System.out.println("Enter your name");
	String name = sc.nextLine();
	sc.nextLine();
	System.out.println("Entered");
}
}
