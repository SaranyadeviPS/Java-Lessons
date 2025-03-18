package sample;

public class Operators {

	public static void main(String[] args) {
		int a=5,b=3;
		System.out.println("a=5,b=3");
		//Arithmetic
		System.out.println("Addition  :"+(a+b));
		System.out.println("Sub  :"+(a-b));
		System.out.println("Mul  :"+(a*b));
		
		//Relation
		System.out.println("Equal(a=5)  :"+(a=5));
		System.out.println("Not equal(a!=b)  :"+(a!=b));
		System.out.println("Less then(b<a)  :"+(b<a));
		System.out.println("Geater than or Equal to(a>=b)  : "+(a>=b));
		
		//Logical
		boolean con1 =true,con2 =false;
		System.out.println(" con1 =true,con2 =false");
		System.out.println("Logical AND(con1&&con2)  :"+(con1&&con2));
		System.out.println("Logical OR(con1||con2)  :"+(con1||con2));
		System.out.println("Logical NOT(!con1)  :"+(!con1));
		
		//unary
		System.out.println("Unary negation(~a)   :"+(~a));
		System.out.println("Unary negation(~b)   :"+(~b));
		System.out.println("Post Incremant(a++)   :" +(a++));
		System.out.println("pre Incremant(++a)   :"+(++a));
		System.out.println("Post decremant(b--)   :"+(b--));
		System.out.println("Pre decremant(--b)   :"+(--b));
		System.out.println("Increment and Decrement(a++ + --a + ++a)   :"+(a++ + --a + ++a));
		//Assingment
		a+=5;//a=a+5
		System.out.println("assingment(a=a+5)   :"+(a+=5));
		
		//Ternary or conditional
		String res = (a>b)?"a is greater " : "b is greater";
		 System.out.println("Result    :" +res);
		 
			
			//Bitwise
		/***
		 * AND--->&
		 * OR--->|
		 * NOT--->~
		 * XOR--->^ same number-->0 , Different number-->1
		 */
			int s=5,t=3;//5-->0101,3-->0011
			System.out.println(" s=5,t=3");
			System.out.println("Bitwise AND(s&t)        :"+(s&t));
			System.out.println("Bitwise OR(s|t))        :"+(s|t));
			System.out.println("Bitwise XOR(s^t)        :"+(s^t));
			System.out.println("Bitwise NOT(~s)         :"+(~s));
		 
			
		//shift 
			/*example
			 *Right shift (10>>3)--->10/2^3-->10/6-->answer 1
			 *Left shift (10<<3)--->10*2^3-->10*6==>ans60
			 */
			
			System.out.println("Shift");
			System.out.println("Right shift(10>>5)     :"+(10>>5));
			System.out.println("Right shift(100>>50)   :"+(100>>50));
			System.out.println("Right shift(15>>6)     :"+(15>>6));
			System.out.println("Right shift(14>>2)     :"+(14>>2));
			
			System.out.println("Left shift(10<<5)     :"+(10<<5));
			System.out.println("Left shift(100<<50)   :"+(100<<50));
			System.out.println("Left shift(15<<6)     :"+(15<<6));
			System.out.println("Left shift(14<<2)     :"+(14<<2));
	}
}
