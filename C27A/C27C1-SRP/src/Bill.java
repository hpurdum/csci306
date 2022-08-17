

import java.util.ArrayList;

public class Bill {
	long bill;
	ArrayList<Item> listsOfItems;

	public Bill(ArrayList<Item> listsOfItems) {
		super();
		this.listsOfItems = listsOfItems;
	}

	public void calculateBill(long tax) {
		for (Item item : listsOfItems) {
			bill += item.getPrice();
		}
		bill += tax;
	}
}