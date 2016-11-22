package com.sales.models;

public class Item {
	
	private int quantity;
	private String name = "";
	private double price;
	private boolean imported;
	
	public Item(String str) {
		//create arrays to help the string parsing
		String[] itemArr, nameAndAmount;
		
		itemArr = str.split(" at ");
		nameAndAmount = itemArr[0].split(" ");
		
		// assign values to the properties.
		this.quantity = Integer.parseInt(nameAndAmount[0]);
		this.price = Double.parseDouble(itemArr[1]);
		this.imported = nameAndAmount[1] == "imported";

		for(int i = 1; i < nameAndAmount.length; i++) {
			this.name += " " + nameAndAmount[i];
			this.name = this.name.trim();
		}
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
		percentage = this.imported ? 15 : 10;
		return price*quantity*percentage/100;
	}
	
	public double getPrice() {
	    return price*quantity;
	}
}
