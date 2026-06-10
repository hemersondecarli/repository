package Hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSets {

	public static void main(String[] args) {

		HashSet<String> names = new HashSet<>();
		Scanner scanner = new Scanner(System.in);

		names.add("Mary");
		names.add("Heme");
		names.add("John");

		int choice = 0;

		while (choice != 5) {
			System.out.println("""
					1 - Add name
					2 - Check if name exists
					3 - Remove name
					4 - Show all names
					5 - Exit
										""");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter a name: ");
				String NameChoice = scanner.nextLine();
				
				names.add(NameChoice);
				break;
			case 2:
				System.out.println("Enter a name");
				String selectName = scanner.nextLine();
				
				if(names.contains(selectName)) {
					System.out.println("Name found");
				}else {
					System.out.println("Name not found");
				}
				break;
			case 3:
				System.out.println("Enter a name to delete");
				String nameDelete = scanner.nextLine();
				
				boolean delete = names.removeIf(name -> name.equalsIgnoreCase(nameDelete));
				
				if(delete) {
					System.out.println(nameDelete+" has been deleted");
				}else {
					System.out.println("Name not found");
				}
				break;
			case 4:
				for (String name : names) {
			
					 System.out.println(name);
				}
				
			}
		}
	}

}
