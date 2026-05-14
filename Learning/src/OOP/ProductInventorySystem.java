package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void viewInfo() {
		System.out.println("name: " + name + " Price: " + price + " quantity: " + quantity);
	}

	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

}

public class ProductInventorySystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		ArrayList<Product> products = new ArrayList<>();
		String name;
		double price;
		int quantity;
		
		while(choice!=8) {
			System.out.println("");
			System.out.println("1 - Add product");
			System.out.println("2 - Show all products");
			System.out.println("3 - Search product by name");
			System.out.println("4 - Update product quantity");
			System.out.println("5 - Update product price");
			System.out.println("6 - Remove product");
			System.out.println("7 - Show total inventory value");
			System.out.println("8 - Exit");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				Product productName = null;
				boolean containName = false;
				
				System.out.println("Name");
				name=scanner.nextLine();
				
				for (Product productx : products) {
					if(productx.getName().equalsIgnoreCase(name)) {
						
						containName = true;
						break;
					}
						}
				
				if(containName==false) {
					System.out.println("Price");
					price = scanner.nextDouble();
					scanner.nextLine();
					System.out.println("Quantity");
					quantity = scanner.nextInt();
					scanner.nextLine();
					
				Product product = new Product(name,price, quantity);
				products.add(product);
				
				}else if (containName == true) {
					System.out.println("Name already exist");
				}
				}
					
					
				
			}
		}
}

