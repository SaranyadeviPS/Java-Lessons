package session_4;

import java.util.Scanner;

public class Problem1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value 1: ");
	int a=sc.nextInt();
	System.out.println("Enter a value 2: ");
	int b=sc.nextInt();
	System.out.println("Enter a value 3: ");
	int c=sc.nextInt();
	if(a>b) {
		if(a>c) {
			System.out.println("a is greater");
		}else {
			System.out.println("c is greater");
		}
	}else {
		System.out.println("b is greater");
	}
	
}
}
