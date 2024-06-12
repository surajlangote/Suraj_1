package Priyanka_Mam;

public class For_Not_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int count = 0;
		int rem;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}

		}
		if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("Not");
		}

	}

}
