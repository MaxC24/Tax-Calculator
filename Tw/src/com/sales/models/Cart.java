package com.sales.models;

import java.util.ArrayList;

public class Cart {
	
	private ArrayList<Item> items;
	private double totalPrice = 0.00;
	private double totalTax = 0.00;
	
	public Cart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
		totalPrice += item.getPrice();
		totalTax += item.getTax();
	}
	
	public void checkOut() {
		for(int i = 0; i < items.size(); i++ ){
			System.out.println(items.get(i).getQuantity() + " " + items.get(i).getName() + ": " + String.format("%.2f", items.get(i).getPrice() + items.get(i).getTax()));
		}
		System.out.println("Sale Taxes: " + String.format("%.2f",totalTax));
		System.out.println("Total: " + String.format("%.2f", (totalPrice + totalTax)));
	}
}
