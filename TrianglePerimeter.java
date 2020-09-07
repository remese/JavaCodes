import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the three sides: ");
		double S1 = input.nextDouble();
		double S2 = input.nextDouble();
		double S3 = input.nextDouble();
		boolean isValid = (S1 + S2 > S3) && (S1 + S3 > S2) && (S2 + S3 > S1);
		if (isValid) {
			System.out.println("The perimeter is " + (S1 + S2 + S3));
	    }
	    else {
	      System.out.println("Input is invalid");
		}

	}
}
