package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static File inputOne;
	public static Scanner scan;
	public static Cart theCart;
	public static Item currentItem;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// create a cart that will checkout and print the receipt.
		theCart = new Cart();
		
		//open the first input file and create a Scanner that will go through each item in the list.
		inputOne = new File("/Users/Sushi24/my-projects/JAVA/Tw/resources/input1.txt");
		scan = new Scanner(inputOne);
		
		// instantiate the currentItem to the first item in the list.
		currentItem = new Item(scan.nextLine());
		
		//loop throught the items in the input and add them to the cart.
		while(currentItem) {
			cart.addItem(currentItem);
			currentItem = new Item(scan.nextItem());
		}
		
		scan.close();
		
		theCart.checkOut() //print the receipt.
		
	}
}
