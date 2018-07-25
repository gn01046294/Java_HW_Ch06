package Ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//由鍵盤不斷讀入字串,直到該字串等於"quit",
//而每個字串由一個以上的數字所組成,如"123 56 999 40" 計算出該字串內所有數字的總和,平均,最大值和最小值
public class Q5 {

	public static void main(String[] args) {
		System.out.println("請在下方輸入數字字串,為您計算及統計;輸入quit則結束");
		Scanner scan = new Scanner(System.in);
		qq: while (scan.hasNext()) {
			String str = scan.nextLine();
			if (str.equals("quit")) {
				System.out.println("結束!掰掰QQ");
				break;
			}
			String st[] = str.split(" ");
			int y[] = new int[st.length];
			for (int q = 0; q < st.length; q++) {
				y[q] = Integer.valueOf(st[q]);
			}
			Arrays.sort(y);
			System.out.println("您輸入的字串最大值為:" + y[y.length - 1]);
			System.out.println("您輸入的字串最小值為:" + y[0]);
			int sum = 0, avg = 0;
			for (int i = 0; i < y.length; i++) {
				sum += y[i];

			}
			avg = sum / y.length;
			System.out.println("您輸入的數字字串總和為" + sum);
			System.out.println("您輸入的數字字串平均為" + avg);
			System.out.println("統計完成");
			continue qq;
		}

	}
}