import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int NUM = input.nextInt();
		boolean PRIME = true;
		for (int i = 2; i <= NUM - 1; i++) {
			if (NUM % i == 0) {
				PRIME = false;
			}
		}
		if (PRIME == true) {
			System.out.println(NUM + " is a prime number.");
		} else {
			System.out.println(NUM + " is NOT a prime number");
		}


	}

}
