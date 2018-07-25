package Ch06;

public class factorialmain_Q2 {

	public static void main(String[] args) {
		factorial a = new factorial();

		System.out.println(a.factorial(5));
	}

}

class factorial {

	 long factorial(int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
}
