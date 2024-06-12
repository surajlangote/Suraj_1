package Priyanka_Mam;

import java.util.Scanner;

class sample{
	Scanner sc = new Scanner(System.in);
	void get() {
		int a,b;
//		Scanner sc = new Scanner(System.in);
	    System.out.println("enter 2 no :");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    int c=a+b;
	    System.out.println("add :"+c);
	}
	void get1() {
		int a,b;
		//Scanner sc = new Scanner(System.in);
	    System.out.println("enter 2 no :");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    int c=a-b;
	    System.out.println("sub :"+c);
	}
	void get2() {
		int a,b;
		//Scanner sc = new Scanner(System.in);
	    System.out.println("enter 2 no :");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    int c=a*b;
	    System.out.println("mul :"+c);
	}
	void get3() {
		int a,b;
		//Scanner sc = new Scanner(System.in);
	    System.out.println("enter 2 no :");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    int c=a/b;
	    System.out.println("div :"+c);
	}
}

public class arithmatic_Scanner_oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s1= new sample();
		s1.get();
		s1.get1();
		s1.get2();
		s1.get3();
		
	}

}
