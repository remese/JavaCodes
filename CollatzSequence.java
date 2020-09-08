/**
 * The Collatz conjecture is a conjecture in mathematics that concerns a
 * sequence defined as follows: start with any positive integer n. Then each
 * term is obtained from the previous term as follows: if the previous term is
 * even, the next term is one half the previous term. If the previous term is
 * odd, the next term is 3 times the previous term plus 1. The conjecture is
 * that no matter what value of n, the sequence will always reach 1.
 */
import java.util.Scanner;
public class CollatzSequence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int NUM = input.nextInt();
		while (NUM != 1) {
			System.out.print(NUM+ " ");
			if (NUM % 2 == 0) {
				NUM = NUM / 2;
			} else {
				NUM = NUM * 3 + 1;
			}
		}
		System.out.print(NUM + " ");
	}
}
