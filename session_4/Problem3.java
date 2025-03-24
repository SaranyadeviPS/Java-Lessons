package session_4;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.convert mile to km");
        System.out.println("2.convert km to mile");
        System.out.println("Enter the option  :");
        int a = sc.nextInt();
        
        // Declare the variables outside the if-else block
        double km = 0;
        double mile = 0;

        if (a == 1) {
            System.out.println("Enter mile value  :");
            mile = sc.nextDouble();
        } else if (a == 2) {
            System.out.println("Enter km value  :");
            km = sc.nextDouble();
        } else {
            System.out.println("Invalid value");
            return; // Exit if an invalid option is selected
        }

        double result;
        switch (a) {
            case 1:
                result = mile * 1.609344;
                System.out.println("Result: " + result + " km");
                break;
            case 2:
                result = km * 0.621371;
                System.out.println("Result: " + result + " miles");
                break;
            default:
                System.out.println("Enter a valid option");
        }
    }
}
