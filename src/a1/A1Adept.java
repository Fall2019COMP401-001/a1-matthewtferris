package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfItemsInStore = scan.nextInt();
		String[] typeOfItem = new String[numberOfItemsInStore];
		double[] priceOfItem = new double[numberOfItemsInStore];
		
		for (int i = 0; i < numberOfItemsInStore; i++) {
			typeOfItem[i] = scan.next();
			priceOfItem[i] = scan.nextDouble();
		}
		
		int numberOfCustomers = scan.nextInt();
		String[] customers = new String[numberOfCustomers];
		double[] totalAmountSpent = new double[numberOfCustomers];
		
		for (int i = 0; i < numberOfCustomers; i++) {
			customers[i] = scan.next() + " " + scan.next();
			int amountOfItemsBought = scan.nextInt();
			for (int x = 0; x < amountOfItemsBought; x++) {
				int howManyOfItem = scan.nextInt();
				String item = scan.next();
				double priceItem = priceOfItem[getIndex(typeOfItem, item)]; 
				totalAmountSpent[i] += howManyOfItem * priceItem;
			}
		}
		
		double Biggest = totalAmountSpent[0];
		String Who = customers[0];
		
		for (int y = 0; y < numberOfCustomers; y++) {
			if (totalAmountSpent[y] > Biggest) {
				Biggest = totalAmountSpent[y];
				Who = customers[y];
			}
		}
		
		double Smallest = totalAmountSpent[0];
		String Who2 = customers[0];
		
		for (int z = 0; z < numberOfCustomers; z++) {
			if (totalAmountSpent[z] < Smallest) {
				Smallest = totalAmountSpent[z];
				Who2 = customers[z];
			}
		}
		
		double totalAmount = 0.0;
		
		for (int y = 0; y < numberOfCustomers; y++) {
			totalAmount += totalAmountSpent[y];
		}
		
		double average = totalAmount / numberOfCustomers;
		
		System.out.println("Biggest: " + Who + "(" + String.format("%.2f", Biggest) + ")");
		System.out.println("Smallest: " + Who2 + "(" + String.format("%.2f", Smallest) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		scan.close();
		
	}
	
	public static int getIndex (String[] typeOfItem, String item) {
		for (int a = 0; a < typeOfItem.length; a++) {
			if (typeOfItem[a].equals(item)) {
				return a;
			}
		}
		return -1; 
	}
	
}
