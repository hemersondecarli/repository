package Learning;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//defining array size
		System.out.println("enter size");
		int size = scanner.nextInt();
		//clears the buffer
		scanner.nextLine();
		
		
		//array size is defined by what the user enters
		String names[] = new String [size];

		//looping and collecting names
		for (int i = 0; i<names.length; i++) {
			System.out.println("enter name");
			names[i] = scanner.nextLine();
		}
		
		//looping and displaying names
		for (int j = 0; j<names.length; j++) {
			System.out.println(names[j]);
		}
	}
}
