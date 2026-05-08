package Learning;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStockSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> stock = new HashMap<>();

        int option = 0;

        while (option != 6) {

            System.out.println();
            System.out.println("1 - Add product");
            System.out.println("2 - Update product quantity");
            System.out.println("3 - Search product");
            System.out.println("4 - Remove product");
            System.out.println("5 - Show all products");
            System.out.println("6 - Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
            	// add product
            	System.out.print("enter a product to add: ");
                String addProduct = scanner.nextLine();
                
                if (!stock.containsKey(addProduct)) {
                System.out.print("enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                
                stock.put(addProduct, quantity);
                }else {System.out.println("item already exist in stock");}
            } else if (option == 2) {
                // Update quantity
            
            System.out.println("Enter product name to change its quantity ");
            String productName = scanner.nextLine();
            
        	if(stock.containsKey(productName)) {
            System.out.println("enter new quantity: ");
            
            int newQuantity = scanner.nextInt();
            scanner.nextLine();
            stock.put(productName, newQuantity);
            
            }else {
            	System.out.println("Product not found");
            }

            } else if (option == 3) {
                // Search product
                System.out.println("enter a product name to search: ");
                String name = scanner.nextLine();

                if (stock.containsKey(name)) {
                    System.out.println("found: " + name + " quantity: " + stock.get(name));
                } else {
                    System.out.println("not found");
                }
                
            } else if (option == 4) {
            	System.out.print("Enter a product name to remove from the stock: ");
            	String removeProduct = scanner.nextLine();
            	if(stock.containsKey(removeProduct)) {
            	    stock.remove(removeProduct);
            	}else {
            		System.out.println("product not found");
            	}
        
            } else if (option == 5) {
                // Show all products
            	if(stock.isEmpty()) {
            		System.out.println("Stock is empty");
            	}else {
            	for (String allProducts : stock.keySet()) {
            		System.out.println(allProducts + " quantity: " + stock.get(allProducts));
            	}
            	}
            } else if (option == 6) {
                System.out.println("Exiting system...");

            } else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}