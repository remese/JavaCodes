import java.util.Scanner;

public class HeightOfStudents {

	public static void main(String[] args) {
		double HEIGHT;
		int TOTAL_T = 0;
		int TOTAL_S = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter the height of student" + (i+1) + ":");
			HEIGHT = input.nextDouble();
			if (HEIGHT > 1.6) {
				TOTAL_T = TOTAL_T + 1;
			}
			if (HEIGHT < 1.6) {
				TOTAL_S = TOTAL_S + 1;
			}
		}
		System.out.println("Number of students taller than 1.6 metres: " + TOTAL_T);
		System.out.println("Number of students shorter than 1.6 metres: " + TOTAL_S);

	}

}