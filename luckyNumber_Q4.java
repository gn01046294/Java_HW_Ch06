package Ch06;

public class luckyNumber_Q4 {

	public static void main(String[] args) {

		luckyNumbers_Q4 hk = new luckyNumbers_Q4();

		int a[] = new int[6];

		a = hk.luckyNumbers();
		int x = 0;
		while(x < 6)
				 {
			System.out.print(a[x] + " ");
			x++;
				 }
//		for (int x = 0; x < 6; x++) { // ��for�j��u�O�n���F�N���Ӥ������ƦC�X��
//			System.out.print(a[x] + " ");
//		}

	}
}

class luckyNumbers_Q4 {

	int[] luckyNumbers() {

		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 42 + 1);
		}
		return lotto;
	}

}