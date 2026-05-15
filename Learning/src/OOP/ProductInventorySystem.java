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
		boolean productExist = false;

		while (choice != 8) {
			System.out.println("");
			System.out.println("1 - Add product");
			System.out.println("2 - Search product by name");
			System.out.println("3 - Show all products");
			System.out.println("4 - Update product quantity");
			System.out.println("5 - Update product price");
			System.out.println("6 - Remove product");
			System.out.println("7 - Show total inventory value");
			System.out.println("8 - Exit");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:

				boolean containName = false;

				System.out.println("Name");
				name = scanner.nextLine();

				for (Product productx : products) {
					if (productx.getName().equalsIgnoreCase(name)) {

						containName = true;
						break;
					}
				}

				if (containName == false) {
					System.out.println("Price");
					price = scanner.nextDouble();
					scanner.nextLine();
					System.out.println("Quantity");
					quantity = scanner.nextInt();
					scanner.nextLine();

					Product product = new Product(name, price, quantity);
					products.add(product);
					System.out.println("New product was added");

				} else if (containName == true) {
					System.out.println("Name already exist");
				}
				break;

			case 2:
				Product product = null;
				System.out.println("Enter product name");
				String productName = scanner.nextLine();

				for (Product prod : products) {
					if (prod.getName().equalsIgnoreCase(productName)) {
						product = prod;
						productExist = true;
					}
				}
				if (productExist == true) {
					product.viewInfo();
				} else {
					System.out.println("Product not found");
				}
				break;
			case 3:
				if (products.isEmpty()) {
					System.out.println("No products registered");
				} else {
					for (Product pro : products) {
						pro.viewInfo();
					}
				}
				break;
			case 4:
				System.out.println("Enter product to update quantity");
				name = scanner.nextLine();
				Product productQuantity = null;

				for (Product searchQuantity : products) {
					if (searchQuantity.getName().equalsIgnoreCase(name)) {
						productQuantity = searchQuantity;
						productExist = true;
						break;
					}
				}
				if (productExist == true) {
					System.out.println("Enter new quantity: ");
					quantity = scanner.nextInt();
					productQuantity.setQuantity(quantity);
					productExist = false;
				} else if (productExist == false) {
					System.out.println("Product not found");
				}
				break;
			case 5:
				System.out.println("Enter product name to update price");
				productName = scanner.nextLine();
				Product productPrice = null;

				for (Product productx : products) {
					if (productx.getName().equalsIgnoreCase(productName)) {
						productPrice = productx;
						productExist = true;
						break;
					}
					if (products.isEmpty()) {
						System.out.println("Empty list");
					} else {
						if (productExist == true) {
							System.out.println("Enter new price: ");
							price = scanner.nextDouble();
							scanner.nextLine();
							productPrice.setPrice(price);
							productExist = false;
						} else if (productExist == false) {
							System.out.println("Product not found");
						}
					}
				}
				break;
			case 6:

				if (products.isEmpty()) {
					System.out.println("No products to delete");
				} else {
					System.out.println("Enter product name to remove");
					productName = scanner.nextLine();
					Product productDelete = null;
					for (Product deleteProduct : products) {
						if (deleteProduct.getName().equalsIgnoreCase(productName)) {
							productDelete = deleteProduct;
							productExist = true;
						}
					}
					if (productExist == true) {
						products.remove(productDelete);
						productExist = false;
					} else if (productExist == false) {
						System.out.println("Product not found");
					}
				}
				break;
			case 7:
				if (products.isEmpty()) {
					System.out.println("No products registered");
				} else {
					double total = 0;
					for (Product checkPrice : products) {
						price = checkPrice.getPrice();
						quantity = checkPrice.getQuantity();

						total = total + price * quantity;
						
					}
					System.out.println("total price of stock: " + total);
				}
				break;
			case 8:
				System.out.println(".......Closing System.......");
			}// end switch
		}

	}// end while

}
