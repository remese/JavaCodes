import java.util.Scanner;

public class SolvingQuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A, B, C: ");
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double D = B * B - 4 * A * C;
		if (D < 0) {
			System.out.println("The equation has no real roots.");
		} else if (D == 0) {
			double X1 = -B / (2 * A);
		} else {
			double X1 = (-B + Math.pow(D, 0.5)) / (2 * A);
			double X2 = (-B - Math.pow(D, 0.5)) / (2 * A);
			System.out.println("X1 = " + X1 + ", X2 = " + X2);
		}

	}

}
