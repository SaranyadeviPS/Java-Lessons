package session_3;

public class Nasted_for_loop {

	public static void main(String[] args) {
		//nested for loop
		System.out.println("Multiplication Table");
				for(int a=1;a<=5;a++) {
					for(int b=1;b<=5;b++) {
						System.out.println(a+ "X" +b+ "="+(a*b));
					}
					System.out.println();
				}
				
				
				//another nasted loop ex1
				for(int i=1;i<=5;i++) {
					for(int j=1;j<i+1;j++) {
						System.out.print(j+" ");
					}
					System.out.println();
				}
				
				//another nasted loop ex2
				int num=6;
			for(int i=1;i<=num;i++) 
			  {
					for(int j=1;j<=num-i;j++)
				
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				
	}
}
