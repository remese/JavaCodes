package stock;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getChangePercent() {
		double changePercent = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
		return Math.round(changePercent * 100) / (double) 100;
	}
}