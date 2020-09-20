import java.util.Scanner;
public class Exercise_4_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char C = input.next().charAt(0);
		System.out.println("The Unicode for the character " + C + " is " + (int) C);
	}
}
