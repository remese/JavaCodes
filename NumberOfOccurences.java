import java.util.Scanner;

public class NumberOfOccurences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		System.out.println("Enter a character: ");
		char c = input.next().charAt(0);
		System.out.println(count(s,c));
		
		System.out.println(count("Welcome",'e'));
	}

	public static int count(String s, char a) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (a == s.charAt(i)) {
				count = count + 1;
			}
		}
		return count;
	}

}
