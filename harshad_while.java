package Priyanka_Mam;

public class harshad_while {

	// HARSHAD Number
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=123;// 1+2+3%6==0->Harshad
		int temp=n;
		int rem;
		int sum=0;
		while(n>0) {
			
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(temp%sum==0) {
			System.out.println("Harshad");
		}
		else {
			System.out.println("Not");
		}

	}

}
