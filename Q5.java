package Ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//����L���_Ū�J�r��,����Ӧr�굥��"quit",
//�ӨC�Ӧr��Ѥ@�ӥH�W���Ʀr�Ҳզ�,�p"123 56 999 40" �p��X�Ӧr�ꤺ�Ҧ��Ʀr���`�M,����,�̤j�ȩM�̤p��
public class Q5 {

	public static void main(String[] args) {
		System.out.println("�Цb�U���J�Ʀr�r��,���z�p��βέp;��Jquit�h����");
		Scanner scan = new Scanner(System.in);
		qq: while (scan.hasNext()) {
			String str = scan.nextLine();
			if (str.equals("quit")) {
				System.out.println("����!�T�TQQ");
				break;
			}
			String st[] = str.split(" ");
			int y[] = new int[st.length];
			for (int q = 0; q < st.length; q++) {
				y[q] = Integer.valueOf(st[q]);
			}
			Arrays.sort(y);
			System.out.println("�z��J���r��̤j�Ȭ�:" + y[y.length - 1]);
			System.out.println("�z��J���r��̤p�Ȭ�:" + y[0]);
			int sum = 0, avg = 0;
			for (int i = 0; i < y.length; i++) {
				sum += y[i];

			}
			avg = sum / y.length;
			System.out.println("�z��J���Ʀr�r���`�M��" + sum);
			System.out.println("�z��J���Ʀr�r�ꥭ����" + avg);
			System.out.println("�έp����");
			continue qq;
		}

	}
}