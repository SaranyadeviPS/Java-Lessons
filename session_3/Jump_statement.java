package session_3;

public class Jump_statement {
public static void main(String[] args) {
	int i=1,j=1;
	
	//Break statement
	while(i<10) {
		if(i==5) {
			break;
		}
		System.out.println(i);
		i++;
	}
	
	
	//Continue statement
	while(j<10) {
		if(j==5) {
			j++;
			continue;
		}
		System.out.println(j);
		j++;
	}
}
}
