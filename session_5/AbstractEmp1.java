package session_5;

public class AbstractEmp1 extends AbstractEmp {
	@Override
	public void futuredes() {
		System.out.println("Full stack developer");
	}
public static void main(String[] args) {
	AbstractEmp1 ae=new AbstractEmp1();
	ae.name();
	ae.des();
	ae.futuredes();
}


}
