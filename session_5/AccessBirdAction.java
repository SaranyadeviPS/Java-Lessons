package session_5;

import java.util.jar.Manifest;

public class AccessBirdAction extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("Birds Fly...");
		
	}
public static void main(String[] args) {
	AccessBirdAction aba=new AccessBirdAction();
	aba.fly();
	aba.eat();
}
}
