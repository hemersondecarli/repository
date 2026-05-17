package OOP;

import java.util.ArrayList;
import java.util.Scanner;


class Digimon {
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void showDigimon() {
		System.out.println("Name: " + name + " level: " + level + " type: " + type + " health: " + health);
	}
	
	private String name;
	private int level;
	private String type;
	private int health;
	
	public Digimon(String name, int level, String type, int health) {
		this.name = name;
		this.level = level;
		this.type = type;
		this.health = health;
	}
	
}
public class DigimonLambdaChallenge {

	public static void main(String[] args) {
		ArrayList<Digimon> digimons = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		digimons.add(new Digimon("Agumon", 5, "Fire", 100));
		digimons.add(new Digimon("Gabumon", 24, "Ice", 90));
		digimons.add(new Digimon("Patamon", 11, "Ice", 70));

		int option = 0;

		while (option != 7) {

			System.out.println();
			System.out.println("1 - Show all Digimons");
			System.out.println("2 - Show Digimons above level 10");
			System.out.println("3 - Show Fire type Digimons");
			System.out.println("4 - Show Digimons with health below 100");
			System.out.println("5 - Count Fire type Digimons");
			System.out.println("6 - Search Digimon by name");
			System.out.println("7 - Exit");
			System.out.print("Choose an option: ");

			option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {

			case 1:
				// Show all Digimons
				digimons.forEach((digimon -> digimon.showDigimon()));
				break;

			case 2:
				// Show Digimons above level 10
				Digimon digimonSave = null;
				boolean digimonAboveTen = false;
				
				for (Digimon digimon : digimons) {
					if(digimon.getLevel() >= 10) {
						digimon.showDigimon();
						digimonAboveTen=true;
					}
				}
				if(digimonAboveTen==false) {
					System.out.println("no digimons above level 10");
				}
				
				break;

			case 3:
				// Show Fire type Digimons
				break;

			case 4:
				// Show Digimons with health below 100
				break;

			case 5:
				// Count Fire type Digimons
				break;

			case 6:
				// Search Digimon by name
				break;

			case 7:
				System.out.println("Exiting system...");
				break;

			default:
				System.out.println("Invalid option");
			}
		}

	}
}
