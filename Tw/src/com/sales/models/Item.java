package com.sales.models;

import com.sales.utils.Helper;

public class Item {
	
	private int quantity;
	private String name = "";
	private double price;
	private boolean imported, nonTaxable;
	
	public Item(String str) {
		//create arrays to help the string parsing
		String[] itemArr, nameAndAmount;
		
		itemArr = str.split(" at ");
		nameAndAmount = itemArr[0].split(" ");
		
		// assign values to the properties.
		this.nonTaxable = Helper.isTaxable(itemArr[0]);
		this.quantity = Integer.parseInt(nameAndAmount[0]);
		this.price = Double.parseDouble(itemArr[1]);
		this.imported = nameAndAmount[1] == "imported";
		this.name = Helper.fixName(nameAndAmount);
	}

	public String getName(){
		return name;
	}
	
	
	public boolean isImported() {
		return imported;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getTax() {
		int percentage;
		percentage = imported ? (nonTaxable ? 5 : 15) : (nonTaxable ? 0 : 10);
		return Helper.taxRound(price*quantity*percentage/100);
//		return price*quantity*percentage/100;
	}
	
	public double getPrice() {
	    return price*quantity;
	}
}
