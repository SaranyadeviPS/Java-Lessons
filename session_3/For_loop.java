package session_3;

public class For_loop {

	public static void main(String[] args) {
		int n=10,i;
		for(i=1;i<n;i++) {
			System.out.println("value of I:"+i);
		}
		System.out.println("Final value:"+i);
		
		
		//nested for loop
		for(int a=1;a<=5;a++) {
			System.out.println();
			for(int b=1;b<=5;b++) {
				System.out.print(a);
			
			}
		}
	}
}
