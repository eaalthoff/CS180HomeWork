import java.util.*;
public class CoinApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some number of cents below 100.");
		int cents=scan.nextInt();
		int numQuart=(cents / 25);
		cents=cents%25;
		int numDimes=(cents / 10);
		cents=cents%10;
		int numNickels=(cents / 5);
		cents=cents%5;
		int numPennies=(cents / 1);
		cents=cents%1;
		System.out.println("You may have " + Math.round(numQuart) + " quarters, " + Math.round(numDimes) + " dimes, " + Math.round(numNickels) + " nickels, and " + Math.round(numPennies) + " pennies.");
		
	}

}
