import java.util.Random;
import java.util.Scanner;

public class Main {

	public static int number, guess, maxValue;
	public static Scanner scan;
	public static Random rand;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		rand = new Random();
		System.out.println("please enter a max Number: ");
		maxValue = scan.nextInt() -1;
		number = rand.nextInt(maxValue) + 1;
		System.out.print("Please enter a guess: ");
		while (guess != number) {
			guess = scan.nextInt();
			if (guess < number) {
				System.out.println("Your guess is too low, try again");
			} else if(guess > number){
				System.out.println("Your guess is too high, try again");
			}
		}
		System.out.println("You guessed");
	}
}
