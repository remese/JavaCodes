import java.util.Scanner;

public class WeightOfItems {

	public static void main(String[] args) {
		double HEAVIEST = 0;
		double LIGHTEST = 99999;
		double WEIGHT;
		double TOTAL = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the weight of the item (kg): ");
			WEIGHT = input.nextDouble();
			if (WEIGHT > HEAVIEST) {
				HEAVIEST = WEIGHT;
			}
			if (WEIGHT < LIGHTEST) {
				LIGHTEST = WEIGHT;
			}
			TOTAL = TOTAL + WEIGHT;
		}
		double AVERAGE = TOTAL / 5;
		double ROUNDED = Math.round(AVERAGE * 100)/(double)100;
		System.out.println("The heaviest item is " + HEAVIEST + "kg");
		System.out.println("The lightest item is " + LIGHTEST + "kg");
		System.out.println("The average weight of all the items " + ROUNDED + "kg");


	}

}
