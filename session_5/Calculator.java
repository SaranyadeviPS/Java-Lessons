package session_4;

public class Calculator {
	//By changing the no.of argumants
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(3, 5, 6));
		System.out.println(cal.add(3, 5));
	}
	
	
	
	
	
	
	
	
	

}
