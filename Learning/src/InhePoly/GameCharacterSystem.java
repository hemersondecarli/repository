package InhePoly;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GameCharacterSystem {

	public static void main(String[] args) {
		ArrayList<Character> characters = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		characters.add(new Warrior("Dhenlock", 50, 100));
		characters.add(new Mage("Never Myth", 9, 100));
		characters.add(new Archer("Madarazin", 7, 100));

		int choice = 0;

		while (choice != 5) {
			System.out.println("""
					1 - Show all characters
					2 - Make all characters attack
					3 - Show characters above level 10
					4 - Search character by name
					5 - Exit
							""");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				characters.stream().forEach(Character::viewInfo);
				break;
			case 2:
				characters.stream().forEach(Character::attack);
				break;
			case 3:
				characters.stream().filter(character -> character.getLevel() > 10).forEach(Character::viewInfo);
				break;
			case 4:
				System.out.println("Enter character name to view stats");
				String name = scanner.nextLine();
				
				characters.stream().filter(character -> character.getName().equalsIgnoreCase(name)).forEach(Character::viewInfo);
				break;
			case 5:
				System.out.println("System closing...");
				break;
				default:
					System.out.println("Wrong option");
				
			}

		}
	}

}
