package Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShoppingCartSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, ArrayList<String>> products = new HashMap<>();

		int choice = 0;

		while (choice != 7) {
			System.out.println("1 - Add category");
			System.out.println("2 - Add product to category");
			System.out.println("3 - Add products in one category");
			System.out.println("4 - Remove product from category");
			System.out.println("5 - Show all categories and products");
			System.out.println("6 - Count products in one category");
			
			choice = scanner.nextInt();
			scanner.nextLine();

			switch(choice) {
			case 1:
				String categoryName;
				System.out.println("Enter new category");
				categoryName = scanner.nextLine();
				if(products.containsKey(categoryName)) {
					System.out.println("Category already exists");
				}else {
				products.put(categoryName, new ArrayList<>());
				}
				break;
				
			case 2:
				System.out.println("Enter category name");
				categoryName = scanner.nextLine();
				if(products.containsKey(categoryName)) {
					System.out.println("Enter product name");
					String productName = scanner.nextLine();
					
					if(products.get(categoryName).contains(productName)) {
						System.out.println("Product already exists in this category");
					}else {
					products.get(categoryName).add(productName);
					}
				}
			}
		}
	}
}
