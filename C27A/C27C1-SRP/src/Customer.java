

import java.util.ArrayList;

public class Customer {

	String name;
	int age;
	ArrayList<Item> listsOfItems;
	Bill bill;
	Report report;

	Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public ArrayList<Item> getListsOfItems() {
		return listsOfItems;
	}

	public void setListsOfItems(ArrayList<Item> listsOfItems) {
		this.listsOfItems = listsOfItems;
		bill = new Bill(listsOfItems);
		report = new Report(name, bill);
	}

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();

		items.add(new Item(25));
		items.add(new Item(45));

		Customer fred = new Customer("Fred", 25);
		fred.setListsOfItems(items);
		fred.bill.calculateBill(10);
		fred.report.generateReport("CSV");
		System.out.println(fred.report.getReport());
		
		Customer karen = new Customer( "Karen", 30 ) ;
		items.clear();
		items.add(new Item(10));
		items.add(new Item(10));
		karen.setListsOfItems(items);
		karen.bill.calculateBill(20);
		karen.report.generateReport("XML");
		System.out.println(karen.report.getReport());
	}

}