public class Rectangle {
	// data members
	private double width = 1;
	private double height = 1;

	// no-arg constructor
	public Rectangle() {
	}

	// second constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// getter method making the private width data field accessible
	public double getWidth() {
		return width;
	}

	// getter method making the private height data field accessible
	public double getHeight() {
		return height;
	}

	// setter method to enapble the private width data field to be updated
	public void setWidth(double width) {
		this.width = width;
	}

	// setter method to enapble the private height data field to be updated
	public void setHeight(double height) {
		this.height = height;
	}

	// return the area of a rectangle
	public double getArea() {
		return this.width * this.height;
	}

	// return the perimeter of a rectangle
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}

}
