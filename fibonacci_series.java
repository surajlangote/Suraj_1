package Priyanka_Mam;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1;
		
		System.out.print(n1+","+n2+",");
		for(int i=1; i <=5; i++) {
			int n3=n1+n2;
			System.out.print(","+n3);
			
			n1=n2;
			n2=n3;
		}
	}

}
