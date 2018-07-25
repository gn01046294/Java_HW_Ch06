package Ch06;

 class MyRectangle {
	double width;
	double depth;

 MyRectangle() {
	}
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	public void setWidth(double w) {
		this.width = w;
	}
	public void setdepth(double d) {
		this.depth = d;
	}
	public double getArea() {
		double area = width * depth;
		return area;
	}
	public boolean equals(Object obj) {
		return true;
	}
public int hashCode() {
	return 1;
}
}

