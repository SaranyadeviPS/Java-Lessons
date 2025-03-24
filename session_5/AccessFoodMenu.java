package session_5;

public class AccessFoodMenu implements VegItems,NonvegItems {

	@Override
	public void fry() {
		System.out.println("Chicken fry");
		
	}

	@Override
	public void gravy() {
		System.out.println("Chicken gravy");
		
	}

	@Override
	public void breakfast() {
		System.out.println("Dosa,Pongal");
		
	}

	@Override
	public void lunch() {
		System.out.println("Tomato fry");
		
	}

	public static void main(String[] args) {
		AccessFoodMenu amf=new AccessFoodMenu();
		amf.breakfast();
		amf.fry();
		amf.gravy();
		amf.lunch();
	}
}
