package Ch06;

	public class MyRcctangleMain  {
		
		public static void main(String[] args) {
			//B	
			MyRectangle R1 =new MyRectangle();
			R1.width = 10;
			R1.depth = 20;
			System.out.println(R1.getArea());
			//C
			MyRectangle R2 =new MyRectangle(10,20);
			System.out.println(R2.getArea());
			
		}}

		
