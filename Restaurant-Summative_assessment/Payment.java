
public class Payment {
	private FoodItem[] fi = new FoodItem[100];
	private int fiCount;
    private static double foodTax = 0.2; // 20% sales tax added to all food prices
	
    private DrinkItem[] di = new DrinkItem[100];
	private int diCount;
	private static double drinkTax = 0.1; // 10% sales tax added to all drink prices

	public Payment() {
		fiCount = 0;
		diCount = 0;
	}

	public DrinkItem getDi(int x) {
		return di[x];
	}

	public FoodItem getFi(int x) {
		return fi[x];
	}

	public FoodItem[] getFi() {
		return fi;
	}

	public int getFiCount() {
		return fiCount;
	}

	public static double getFoodTax() {
		return foodTax;
	}

	public DrinkItem[] getDi() {
		return di;
	}

	public int getDiCount() {
		return diCount;
	}

	public static double getDrinkTax() {
		return drinkTax;
	}

	public void setFi(FoodItem[] fi) {
		this.fi = fi;
	}

	public void setFiCount(int fiCount) {
		this.fiCount = fiCount;
	}

	public static void setFoodTax(double foodTax) {
		Payment.foodTax = foodTax;
	}

	public void setDi(DrinkItem[] di) {
		this.di = di;
	}

	public void setDiCount(int diCount) {
		this.diCount = diCount;
	}

	public static void setDrinkTax(double drinkTax) {
		Payment.drinkTax = drinkTax;
	}

	// addFoodItem() – this method adds a new FoodItem object

	// addDrinkItem() – this method adds a new DrinkItem object


	public static double findPrice(Item[] pl, String c) {
		// code missing 
		return -1;
	}

	public double calculateBill(Item[] pl) {
		// This method returns the bill (the total value of the items
		// consumed for a particular table)
		return -1;
	}

}
