import java.util.Scanner;
public class FactorsOfAnInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int NUMBER = input.nextInt();
		System.out.print("The factors of " + NUMBER + " are the following numbers: ");
		int FACTOR = 2;
		while (FACTOR <= NUMBER) {
			if (NUMBER % FACTOR == 0) {
				NUMBER = NUMBER / FACTOR;
				System.out.print(FACTOR + " ");
			} else {
				FACTOR = FACTOR + 1;
			}
		}
	}
}
