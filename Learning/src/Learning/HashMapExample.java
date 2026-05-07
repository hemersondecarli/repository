package Learning;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        // 1. Add 5 products with prices
        products.put("apple", 5);
        products.put("banana", 15);
        products.put("chocolate", 3);
        products.put("brush", 7);
        products.put("water", 1);
        
        
        // 2. Print all products and prices
        for (String item : products.keySet()) {
        	System.out.println(item +" cost: "+products.get(item));
        }

        // 3. Search price of one product
        	System.out.println("Type a product name to check the price");
        	String productName = scanner.nextLine();
        	
    
        		
        		   if(products.containsKey(productName)) {
        	        	System.out.println("the value of "+productName+" is: " + products.get(productName));
        	        }
     
        	
        // 4. Remove one product
        	products.remove("apple");

        // 5. Print final HashMap
            for (String item : products.keySet()) {
            	System.out.println(item +" cost: "+products.get(item));
            }
    }
}