import java.util.Scanner;
public class CharacterIsAlphabetOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char C = input.next().charAt(0);
		if (C >= 'A' && C <= 'Z' || C >= 'a' && C <= 'z') {
			System.out.println(C + " is an Alphabet");
		} else {
			System.out.println(C + " is not an Alphabet");
		}
	}
}
