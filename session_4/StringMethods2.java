package session_4;

import java.util.jar.Manifest;

public class StringMethods2 {
public static void main(String[] args) {
	//concat()
	String s1="Static ";
	String s2=new String("program");
	System.out.println(s1.concat(s2));
	
	
	//toCharArray()
	String s3="Welcome to java";
	System.out.print("Value of method: ");
	char[] ch =s3.toCharArray();
	for(char st:ch) {
		System.out.println(st);
	}
	//System.out.println(ch);
	//System.out.println(s3.toCharArray());
	
	
	//subString()
	System.out.println(s3.substring(4));
	System.out.println(s3.substring(0,4));
	
	
	//intern
	String name = new String("Sara");
	String name1 ="Sara";
	String s4=name.intern();
	System.out.println(name1==s4);
}
}
