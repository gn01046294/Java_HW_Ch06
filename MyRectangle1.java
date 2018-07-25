package Ch06;

public class MyRectangle1 extends MyRectangle {

	@Override
	public boolean equals(Object obj) {
		if (this.width == width && this.depth == depth) {
			return true;

		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	public static void main(String[] args) {
		
		Object d, c;
		MyRectangle1 mr1 = new MyRectangle1();
		mr1.width = 4;
		mr1.depth = 5;
		d = (Object) (mr1.getArea());

		MyRectangle1 mr2 = new MyRectangle1();
		mr1.width = 5;
		mr1.depth = 4;
		c = (Object) (mr1.getArea());
		System.out.println(d.equals(c));
	}
}
