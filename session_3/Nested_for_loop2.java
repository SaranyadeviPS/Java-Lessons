package session_3;

import java.util.Scanner;

public class Nested_for_loop2 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int rows = sc.nextInt();
		
		//top of diamond
		for(int i=1;i<=rows;i++){
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//bottom of diamond
				for(int i=rows-1;i>=1;i--)
				{
					for(int j=rows;j>i;j--) {
						System.out.print(" ");
					}
					for(int k=1;k<=(2*i-1);k++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}
}
