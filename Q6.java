package Ch06;

public class Q6 {

	public static void main(String[] args) {
		Unicode u = new Unicode();
         u.toUnicodeString("ABC");
	}

}

class Unicode {
 public String toUnicodeString(String s) {
  String str = s;                           // �N��J���r�� �ᤩ��str

   for (int i = 0; i < str.length(); i++) { //str.length() �r�����ex:"ABC"�N�O3      
	int j = str.charAt(i);                  //�Nstr��i�Ӧr�� �ᤩj (charAt()�q0�}�l�� 0�~�O�Ĥ@��) ((charAtŪ���X�ӬO10�i�� 0> A >65)
 	String z = Integer.toHexString(j);      //�Nj�����ȥ�toHexString��k�ন16�i���ܪk �ᤩz  ((A��10�i��O65 16�i��O41))
	switch (z.length()) {                   //switch()�A�J������ �����U��case 1 ������1 �p�G�O���׬O1�N��case1���ԭz�L�X �p�G�O3�N��case3 �L�X 
	 case 1:                                //z.length()������ 41�N�O2�ҥH������case2 
	 System.out.print("\\u000" + z+" ");
	 break;
     case 2:                                //u0000 �� 16�i���ܪk
	 System.out.print("\\u00" + z+" ");     //�p�n�L�X�׽uu00..�׽u�N�n�h���@�� �ҥH��\\u00 + z.length() �����׬O41
	 break;
	 case 3:
	 System.out.print("\\u0" + z+" ");
	 break;
	 case 4:
	 System.out.print("\\u" + z+" ");
	 break;
		}
		}
	 return str;
	}
}
