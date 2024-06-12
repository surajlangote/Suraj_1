package Priyanka_Mam;

class demo1{
// method	
	void get(String name)
	{
		System.out.println("hello");
		System.out.println(name);
	}
	void get1(int n) {
		System.out.println("welcome");
		System.out.println(n);
	}
}

public class oops_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    class  object = keyword constructor
		demo1 d1 = new demo1();
		d1.get("suraj");
		d1.get1(2);
		
	}

}
