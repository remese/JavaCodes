
public class FoodItem {
	private String itemCode;
	private int quantity;

	public FoodItem(String x, int y) {
		itemCode = x;
		quantity = y;
	}

	public String getItemCode() {
		return itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
