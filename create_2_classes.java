package Priyanka_Mam;

class simple{
	void get(int n) {
		int count =0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
	
	void get1(int n) {
		
		int rem;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			 
		}
		System.out.println(sum);
	}
}
class harshad{
	void get3(int n) {
		
		int temp=n;
		int sum=0;
		int rem;
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

public class create_2_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		simple s2 =new simple();
		s2.get(123);
		s2.get1(123);
		
		harshad s3 = new harshad();
		s3.get3(200);

	}

}
