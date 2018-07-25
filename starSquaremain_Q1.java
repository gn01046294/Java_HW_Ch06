package Ch06;

public class starSquaremain_Q1 {

	public static void main(String[] args) {
		 starSquare ss = new starSquare(); 

		 ss.starSquare(5, 5);
		 
		 
	}

}
class starSquare {

	int width, height;

	void starSquare(int width, int height) {
		for (int w = 0; w < width; w++) {
			for (int h = 0; h < height; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}