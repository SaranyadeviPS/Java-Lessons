package session_4;

public class ConOverloading {
	private String empname;
	private int empid;
	private String location;
	
	public ConOverloading(String empname,int empid,String location) {
		this.empname=empname;
		this.empid=empid;
		this.location=location;
	}
	public ConOverloading(String empname,String location) {
		this(empname,0,location);
	}
	public ConOverloading(String empname,int empid) {
		this(empname,empid,null);
	}
	
	public void display(){
		System.out.println("EmpName  :"+this.empname);
		System.out.println("EmpID  :"+this.empid);
		System.out.println("Location  :"+this.location);
	}
public static void main(String[] args) {
	
	ConOverloading obj = new ConOverloading("Saranya devi",2322,"Avinashi");
	obj.display();
	ConOverloading obj1 = new ConOverloading("Saranya devi","Avinashi");
	obj1.display();
	ConOverloading obj2 = new ConOverloading("Saranya devi",3243,null);
	obj2.display();
	
}
}
