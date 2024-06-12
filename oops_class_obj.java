package Priyanka_Mam;

class studen_t{
	int id;
	int sid;
	String name;
	
}

public class oops_class_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studen_t ss =new studen_t();
		ss.id=10;
		ss.sid=20;
		System.out.println(ss.id+" "+ ss.sid);
		ss.name="suraj";
		System.out.println(ss.name);
		
		studen_t s1 = new studen_t();
		s1.id=2;
		s1.sid=5;
		System.out.println(s1.id+" "+s1.sid);
		
		studen_t s2 = new studen_t();
		s2.id=3;
		s2.sid=7;
		System.out.println(s2.id+" "+s2.sid);
		
		
	}

}
