public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The area of rectangle1 with width " + rectangle1.getWidth() + " and height "
				+ rectangle1.getHeight() + " is " + rectangle1.getArea());
		System.out.println("The perimeter of rectangle1 with width " + rectangle1.getWidth() + " and height "
				+ rectangle1.getHeight() + " is " + rectangle1.getPerimeter());

		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The area of a rectangle2 with width " + rectangle2.getWidth() + " and height "
				+ rectangle2.getHeight() + " is " + rectangle2.getArea());
		System.out.println("The perimeter of a rectangle2 with width " + rectangle2.getWidth() + " and height "
				+ rectangle2.getHeight() + " is " + rectangle2.getPerimeter());
	}

}
