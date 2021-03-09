package stock;

public class TestStock {

	public static void main(String[] args) {
		Stock stock1 = new Stock("A15", "S1");
		stock1.setPreviousClosingPrice(34.5);
		stock1.setCurrentPrice(34.35);
		System.out.print("Price change: " + stock1.getChangePercent() + " %.");
		

	}

}
