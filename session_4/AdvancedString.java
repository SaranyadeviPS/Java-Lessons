package session_4;

public class AdvancedString {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Hello");
	//StringBuilder sb = new StringBuilder("Hello");
	
	//append 
	sb.append("World");
	System.out.println("After append:"+sb);
	
	//insert 
	sb.insert(5,",");
	System.out.println("After insert:"+sb);
	
	//replace
	sb.replace(6, 11, "java");
	System.out.println("After replace:"+sb);
	
	//reverse
		sb.reverse();
		System.out.println("After reverse:"+sb);
}
}
