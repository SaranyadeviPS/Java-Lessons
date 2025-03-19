package session_3;

import java.util.Arrays;

public class ArrayMethod {
public static void main(String[] args) {
	
	//Array length
	int[] num= {10,20,30,40,50,};
	System.out.println("Length of num:"+num.length);
	
	//Copying an array
	int[] source = {1,2,3,10,5};
	int[] destination=new int[5];
	
	//Copy array
	System.arraycopy(source,0,destination,0,source.length);
	for(int i:destination) {
		System.out.println(i+"");
	}
	
	//Array sorting
	int[] b= {4,6,8,7,5};
	Arrays.sort(b);

	System.out.println(Arrays.toString(b));
	
	//Array fill
	int[] d = new int[5];
	Arrays.fill(d,1);
	Arrays.fill(d,1,4,2); //index from 1to4 (n-1)-->index 1,2,3 to fill by 2
	System.out.println(Arrays.toString(d));
	
}
}
