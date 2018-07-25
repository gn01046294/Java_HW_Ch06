package Ch06;

import java.util.Arrays;

public class array_Q3 {

	public static void main(String[] args) {
		int a1[] = { 1000, 500, 70, 60000, 20 };

		mySorta q = new mySorta();
           q.mySort(a1);
           for(int y:a1) {
        	   System.out.print(y+" ");
           }
		
	}
}

class mySorta {
	int[] mySort(int[] arrayInt) {

		Arrays.sort(arrayInt);

		return arrayInt;
	}
}
// for(int y = 0 ;y < a1.length ;y++) {
// System.out.print(a1[y]+" ");
//
// }

//		for (int n : a1) {
//			System.out.print(+n + " ");
//		}