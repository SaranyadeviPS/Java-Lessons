package sample;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an Operation:");
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your option:");
		int choice = sc.nextInt();

		System.out.println("Enter num1:");
	double num1=sc.nextDouble();
		System.out.println("Enter num");
	double num2=sc.nextDouble();
	
	double result;
	switch(choice)
	{
	case 1:
		result =num1+num2;
		System.out.println("Result:"+result);
		break;
	case 2:
		result =num1-num2;
		System.out.println("Result:"+result);
		break;
	case 3:
		result =num1*num2;
		System.out.println("Result:"+result);
		break;
	case 4:
		if(num2!=0) {
		result =num1/num2;
		System.out.println("Result:"+result);
		}else
		{
			System.out.println("division is not done by zero");
		}
		break;
	
	default:
	System.out.println("Enter vaild option");
	
	}
	}
	}
