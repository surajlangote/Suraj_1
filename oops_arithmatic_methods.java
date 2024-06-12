package Priyanka_Mam;

 class assign {
	 
	 //methods
	 void get1(int n)
	 {
		 System.out.println("add :"+n);
	 }
	 
	 void get2(int n)
	 {
		 System.out.println("sub :"+n);
	 }
	 
	 void get3(int n)
	 {
		 System.out.println("mul :"+n);
	 }
	 
	 void get4(int n)
	 {
		 System.out.println("div :"+n);
	 }
	 
	 void get5(int n)
	 {
		 System.out.println("rem :"+n);
	 }
 }

public class oops_arithmatic_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assign s3 = new assign();
		s3.get1(12+11);
		s3.get2(20-5);
		s3.get1(11*6);
		s3.get2(25/5);
		s3.get5(10%2);

	}

}
