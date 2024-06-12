package Priyanka_Mam;

public class count_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
		int count = 0; // 1 //2 //3
		while (num > 0) { // 123>0 12>0 1>0 0>0

			num = num / 10; // 12 1 0
			count++;
		}
		System.out.println(count);
	}

}
