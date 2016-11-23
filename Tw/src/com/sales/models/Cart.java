package com.sales.models;

import java.util.ArrayList;

import com.sales.utils.Helper;

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
		Item it;
		for(int i = 0; i < items.size(); i++ ){
			it = items.get(i);
			System.out.println(it.getQuantity() + " " + it.getName() + ": " + Helper.format(it.getPrice()));
		}
		System.out.println("Sale Taxes: " + Helper.format(totalTax));
		System.out.println("Total: " + Helper.format(totalPrice));
	}
}
