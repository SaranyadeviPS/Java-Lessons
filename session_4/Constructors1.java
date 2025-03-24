package session_4;


public class Constructors1 {
	public Constructors1() {
		System.out.println("Default Constructor");
	}
	public Constructors1(String name,String age) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Parameterized constructor");
	}
	
	public int sum(int a,int b) {
		int res=a-b;
		return res;
	}
public static void main(String[] args) {
	Constructors1 ce =new Constructors1();
	Constructors1 ce1 =new Constructors1("sara","19");
	System.out.println(ce.sum(3, 9));
}
}
