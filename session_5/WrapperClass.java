package session_5;

public class WrapperClass {
public static void main(String[] args) {
	
	//converting primitive to wrapperclass
	int a=Integer.valueOf(50);
	Integer intobj=50;
	Character charobj='S';
	Double dobj=50.98764;
	
	System.out.println(a);
	System.out.println(intobj);
	System.out.println(charobj);
	System.out.println(dobj);
	System.out.println("************************************");
	
	
//Converting Wrapper to primitive
	
	
	int value1=intobj;
	char value2=charobj;
	double value3=dobj;
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	System.out.println("************************************");
	
	
	//Using Utility method from Wrapper class
	int parseInt=Integer.parseInt("123");
	double parseDouble=Double.parseDouble("25.89372135");
	boolean parseBoolean=Boolean.parseBoolean("true");
	
	
	System.out.println(parseInt);
	System.out.println(parseDouble);
	System.out.println(parseBoolean);
	
	
}
}
