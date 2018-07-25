package Ch06;

public class Q6 {

	public static void main(String[] args) {
		Unicode u = new Unicode();
         u.toUnicodeString("ABC");
	}

}

class Unicode {
 public String toUnicodeString(String s) {
  String str = s;                           // 將輸入的字串 賦予給str

   for (int i = 0; i < str.length(); i++) { //str.length() 字串長度ex:"ABC"就是3      
	int j = str.charAt(i);                  //將str第i個字元 賦予j (charAt()從0開始算 0才是第一個) ((charAt讀取出來是10進制 0> A >65)
 	String z = Integer.toHexString(j);      //將j內的值用toHexString方法轉成16進位表示法 賦予z  ((A的10進制是65 16進制是41))
	switch (z.length()) {                   //switch()括胡內的值 對應下方case 1 的那個1 如果是長度是1就用case1的敘述印出 如果是3就用case3 印出 
	 case 1:                                //z.length()的長度 41就是2所以對應到case2 
	 System.out.print("\\u000" + z+" ");
	 break;
     case 2:                                //u0000 → 16進位表示法
	 System.out.print("\\u00" + z+" ");     //如要印出斜線u00..斜線就要多打一個 所以用\\u00 + z.length() ←長度是41
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
