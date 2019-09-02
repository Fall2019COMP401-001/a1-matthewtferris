package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// read in number of customer
		int customers = scan.nextInt();
		String[] customerList = new String[customers];
		double[] totalMoney = new double[customers];
		
		for (int i = 0; i < customers; i++) {
			customerList[i] = scan.next().charAt(0) + ". " + scan.next();
			// adding first initial and last name 
			int numberOfItems = scan.nextInt();
			// how many items purchased
			int x = 0;
			
			while( x < numberOfItems) {
				int item = scan.nextInt();
				// How many of particular items customer bought
				scan.next();
				// disregarding the name of the item (ex. banana)
				totalMoney[i] += item * scan.nextDouble();
				x ++;
			}
			
		}
		
		for (int i = 0; i < customers; i++) {
			System.out.println(customerList[i] + ": " + String.format("%.2f", totalMoney[i]));
		}
		
		scan.close();
		
	}
}
