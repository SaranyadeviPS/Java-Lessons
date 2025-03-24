package session_4;

import java.util.Scanner;

public class StringMethods1 {
public static void main(String[] args) {
	String s1="Java ";
	String s2="Programming";
	String s3="Program";
	//String s4=s1+s2;
	s1=s1+s2;
	System.out.println(s1);
	//1.length()
	System.out.println(s1.length());
	
	//2.equals()
	//3.equalIgnorecase()
	/*Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter ueser name:");
	String un=sc.nextLine();
	
	System.out.println("Enter Password:");
	String pw=sc.next();
	
	if(un.equalsIgnoreCase("admin")&& pw.equals("admin@123"))
	{
		System.out.println("Success");
	}else {
		System.out.println("Error");
	}
	
	//another ex
	System.out.println(s2.equals(s3));  //output false
	       //==
	String s4 = "sara";
	String s5 = "Sara";
	
	System.out.println(s4==s5);
	*/
	String name = new String("Sara");
	String name1 = new String("Sara");
	System.out.println(name==name1);// output==>false
	
	
	//compare to
	//s1>s2-->positive number
	//s1<s2-->negative number
	//s1==s2-->0
	String s7="saranya";
	String s6="hellooo";
	System.out.println(s6.compareTo(s7));
	
}
}
