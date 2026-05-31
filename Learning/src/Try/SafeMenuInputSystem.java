package Try;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeMenuInputSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		while (choice != 3) {
			System.out.println("""
					1 - Say hello
					2 - Show number doubled
					3 - Exit
										""");
			try {
				choice = scanner.nextInt();
				scanner.nextLine();
			} catch (InputMismatchException f) {
				System.out.println("Invalid input. Please choose one of the options listed.");
				scanner.nextLine();
				continue;
			}

			switch (choice) {
			case 1:
				System.out.println("Hello!");
				break;
			case 2:
				try {
					System.out.println("Type a number");
					int number = scanner.nextInt();
					scanner.nextLine();
					int doubled = number * 2;

					System.out.println("number doubled is: " + doubled);
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a number.");
					scanner.nextLine();
				}
				break;
			case 3:
				System.out.println("System closing....");
				break;
			default:
				System.out.println("Wrong option! Please choose one of the options listed.");
			}
		}
		scanner.close();
	}

}
