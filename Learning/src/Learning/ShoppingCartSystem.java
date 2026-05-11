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

			switch (choice) {
			case 1:
				String categoryName;
				System.out.println("Enter new category");
				categoryName = scanner.nextLine();
				if (products.containsKey(categoryName)) {
					System.out.println("Category already exists");
				} else {
					products.put(categoryName, new ArrayList<>());
				}
				break;

			case 2:
				System.out.println("Enter category name");
				categoryName = scanner.nextLine();
				if (products.containsKey(categoryName)) {
					System.out.println("Enter product name");
					String productName = scanner.nextLine();

					if (products.get(categoryName).contains(productName)) {
						System.out.println("Product already exists in this category");
					} else {
						products.get(categoryName).add(productName);
					}
				} else {
					System.out.println("Category not found");
				}
				break;

			case 3:
				System.out.println("Enter category name");
				categoryName = scanner.nextLine();
				if (products.containsKey(categoryName)) {
					if (products.get(categoryName).isEmpty()) { // checks if ArrayList is empty
						System.out.println("No products in this category yet");
					} else {
						for (String showProducts : products.get(categoryName)) {

							System.out.println(showProducts);

						}
					}
				} else {
					System.out.println("Category not found");
				}
				break;
			case 4:
			    System.out.println("Enter category name");
			    categoryName = scanner.nextLine();

			    if (products.containsKey(categoryName)) {
			        System.out.println("Enter product name");
			        String productName = scanner.nextLine();

			        ArrayList<String> productList = products.get(categoryName);

			        if (productList.contains(productName)) {
			            productList.remove(productName);
			            System.out.println("Product removed");
			        } else {
			            System.out.println("Product not found in this category");
			        }

			    } else {
			        System.out.println("Category not found");
			    }
			    break;
			case 5:
				if (products.isEmpty()) {
					System.out.println("No categories registered");
				} else {
					for (String showAll : products.keySet()) {
						System.out.println(showAll);

						for (String showProducts : products.get(showAll)) {
							System.out.println(showProducts);
						}
					}
				}
				break;
			case 6:
			    System.out.println("Enter category name");
			    categoryName = scanner.nextLine();

			    if (products.containsKey(categoryName)) {
			        int total = products.get(categoryName).size();
			        System.out.println(categoryName + " has " + total + " products");
			    } else {
			        System.out.println("Category does not exist");
			    }
			    break;
			case 7:
				System.out.println("System closing.......");
				
				break;
				
			default :
				System.out.println("Wrong option");
			}
		}
	}
}
