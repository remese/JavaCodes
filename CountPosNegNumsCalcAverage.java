import java.util.Scanner;
public class CountPosNegNumsCalcAverage {
	public static void main(String[] args) {
		int countPos = 0;
		int countNeg = 0;
		int COUNT = 0;
		double SUM = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer (the input ends if it is 0): ");
		int DATA = input.nextInt();
		while (DATA != 0) {
			if (DATA > 0) {
				countPos = countPos + 1;
			} else if (DATA < 0) {
				countNeg = countNeg + 1;
			}
			SUM = SUM + DATA;
			COUNT = COUNT + 1;
			System.out.print("Enter an integer (the input ends if it is 0): ");
			DATA = input.nextInt();
		}
		if (COUNT == 0)
			System.out.println("No numbers are entered except 0");
		else {
			System.out.println("The number of positives is: " + countPos);
			System.out.println("The number of negatives is: " + countNeg);
			System.out.println("The total is: " + SUM);
			System.out.println("The average is: " + SUM / COUNT);
		}
	}
}
