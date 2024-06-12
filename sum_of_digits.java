package Priyanka_Mam;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123;
		int rem;
		int sum=0;
		while(num!=0) { //123!=0 12!=0 0!=0
			rem=num%10;  //3 //2 //1
			sum=sum+rem; //3 //5 //6
			num=num/10; //12 //1
		}
		System.out.println(sum);

	}

}
