import java.util.Scanner;
public class Exercise_4_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter and ASCII code: ");
		int DECIMAL = input.nextInt();
		System.out.println("The character for ASCII code " + DECIMAL + " is " + (char)DECIMAL);
	}
}
