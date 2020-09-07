import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int N1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int N2 = input.nextInt();
		int GCD = 1;
		int COMMON = 2;
		while (COMMON <= N1 && COMMON <= N2) {
			if (N1 % COMMON == 0 && N2 % COMMON == 0) {
				GCD = COMMON;
				//System.out.println("Actual common divisor: " + GCD);
			}
			COMMON = COMMON + 1;
		}
		System.out.println("The greatest common divisor for " + N1 + " and " + N2 + " is " + GCD);
	}

}