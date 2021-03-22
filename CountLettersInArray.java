
public class CountLettersInArray {

	public static void main(String[] args) {
		// Declare and create an array
		char[] chars = createArray();

		// Display the array
		System.out.println("The lowercase letters are:");
		displayArray(chars);

		// Count the occurrences of each letter
		int[] counts = countLetters(chars);

		// Display counts
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}

	// Create an array of characters
	public static char[] createArray() {
		/// Declare an array of characters and create it
		char[] chars = new char[10];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		// Return the reference of the array
		return chars;
	}

	// Display the array of character
	public static void displayArray(char[] chars) {
		// Display the characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.println(chars[i]);
			} else {
				System.out.print(chars[i] + " ");
			}
		}
	}

	public static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 int
		int[] counts = new int[26];
		// For each lowercase letter in the array, count it
		for (int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a'] = counts[chars[i] - 'a'] + 1;
		}
		return counts;
		
//		int[] frequency = new int[26];
//		for (int i = 0; i < chars.length; i++) {
//			int character = chars[i];
//			int index = character - 'a'; // gives it a value 0-26, a would be 0, b would be 1
//			frequency[index]++; // increases the value at that position of the array by one every time a character appears
//		}
//		return frequency;
		
//		int[] counts = new int[26];
//		for(int i = 0; i < chars.length; i++) {
//			int countIndex = chars[i] - 97;
//			counts[countIndex]++;	
//		}		
//			return counts;

	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0) {
				System.out.println(counts[i] + " " + (char) (i + 'a'));
			} else {
				System.out.print(counts[i] + " " + (char) (i + 'a') + "  ");
			}
		}
	}

}

//RandomCharacter class is created to get a certain type of character randomly
class RandomCharacter {
	// Generate a random character between ch1 and ch2
	public static char getRandomCharacter(char ch1, char ch2) {
		// Math.random() is used to obtain a random double value between 0.0 and 1.0,
		// excluding 1.0.
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	// Generate a random lowercase letter
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	// Generate a random uppercase letter
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	// Generate a random digit character
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	// Generate a random character
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
