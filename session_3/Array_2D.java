package session_3;

public class Array_2D {

	public static void main(String[] args) {
		int[][] a= {{2,4},{5,7},{6,7},{6,8},{6,7}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
		//Ues for each
		for(int[] i:a) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
			
	}
}
