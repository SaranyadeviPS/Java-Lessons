package sample;


public class Variables {
	int d = 23; //Instance variable
    static int c = 36;
			
		void display() {
			int a = 15;
			System.out.println("value A is" +a);
		}
		
		public static void main(String[] args) {
			int e =46;
			Variables obj =new Variables() ;
			obj.display();
			System.out.println(c);
			System.out.println(obj.d);
			Variable2.student();
			Variable2 obj2 = new Variable2();
			obj2.mark();
		}
}