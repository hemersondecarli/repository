package Learning;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLists {

	public static void main(String[] args) {

	//declaring a linked list
	LinkedList<String> dogs = new LinkedList<String>();
	
	//adding elements to the linked list
	dogs.add("Husky");
	dogs.add("Pitbull");
	
	
		//printing the linked list
		for (int i = 0; i < dogs.size(); i++) {
			
			System.out.println(dogs.get(i));
		}


	}
}
