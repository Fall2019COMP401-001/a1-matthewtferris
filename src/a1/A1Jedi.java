package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int howManyItems = scan.nextInt();
		String [] itemList = new String[howManyItems];
		
		for (int i = 0; i < howManyItems; i++) {
			itemList [i] = scan.next();
			scan.nextDouble();
		}
		
		int howManyCustomers = scan.nextInt();
		int [] customersEachItem = new int[howManyItems];
		int [] totalOfEachItem = new int[howManyItems];
		
		for (int x = 0; x < howManyCustomers; x++) {
			int[] instancesOfEachItem = new int[howManyItems];
			scan.next();
			scan.next();
			int typesOfItemsBought = scan.nextInt();
			for (int y = 0; y < typesOfItemsBought; y++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				instancesOfEachItem[getIndex(itemList, itemName)]++;
				if (instancesOfEachItem[getIndex(itemList, itemName)] <= 1) {
					customersEachItem[getIndex(itemList, itemName)]++;
				}
				totalOfEachItem[getIndex(itemList, itemName)] += quantity;
			}
		}
		
		for (int z = 0; z < howManyItems; z++) {
			if (customersEachItem[z] == 0) {
				System.out.println("No customers bought " + itemList[z]);
			} else {
				System.out.println("" + customersEachItem[z] + " customers bought " +totalOfEachItem[z] + " " + itemList[z]);
			}
		}
		
		scan.close();
		
	}
	
	public static int getIndex (String[] itemList, String nameOfItem) {
		for (int c = 0; c < itemList.length; c++) {
			if (itemList[c].equals(nameOfItem)) {
				return c;
			}
		}
		return -1;
	}
	
}
