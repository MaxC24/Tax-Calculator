package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sales.models.Cart;
import com.sales.models.Item;

public class Main {
	
	public static File input;
	public static Scanner scan;
	public static Cart theCart;
	public static Item currentItem;
	public static String currentLine;
	
	public static void main(String[] args) throws FileNotFoundException {
		//loop through the input*.txt files.
		for(int i = 1 ; i < 4 ; i++) {
			// create a cart that will checkout and print the receipt.
			theCart = new Cart();
			
			//open the first input file and create a Scanner that will go through each item in the list.
			input = new File("/Users/Sushi24/my-projects/JAVA/Tw/resources/input" + i + ".txt");
	
			scan = new Scanner(input);
			
			// instantiate the currentItem to the first item in the list.
			currentLine = scan.nextLine();
			theCart.addItem(new Item(currentLine));
			
			//loop through the items in the input and add them to the cart.
			while(scan.hasNext()) {
				currentLine = scan.nextLine();
				theCart.addItem(new Item(currentLine));
			}
			
			scan.close();
			
			theCart.checkOut(); //print the receipt.
			System.out.println("================================================\n");
		}
	}
}
