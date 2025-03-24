package session_5;

public class AccessPerson {

	public static void main(String[] args) {
		//Original person object
		Person op =new Person("saran",19);
		//copied person object
		Person cp =new Person(op);//object dependency
		
		System.out.println("Original person :");
		op.displayInfo();
		
		System.out.println("copied person :");
		cp.displayInfo();
	}
}
