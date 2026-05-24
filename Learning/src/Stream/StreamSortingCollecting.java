package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

class Pokemon {
	private String name;

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

	public String showPokemons() {
		String allInfo = "name: " + name + " level: " + level + " Type: " + type + " HP: " + health;
		System.out.println(allInfo);
		return allInfo;
	}

	private int level;
	private String type;
	private int health;

	public Pokemon(String name, int level, String type, int health) {
		this.name = name;
		this.level = level;
		this.type = type;
		this.health = health;
	}

}

public class StreamSortingCollecting {

	public static void main(String[] args) {
		ArrayList<Pokemon> pokemons = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		pokemons.add(new Pokemon("Charmander", 10, "Fire", 100));
		pokemons.add(new Pokemon("Squirtle", 5, "Water", 30));
		pokemons.add(new Pokemon("Bulbasaur", 30, "Grass", 50));
		pokemons.add(new Pokemon("Pikachu", 3, "Electric", 10));
		pokemons.add(new Pokemon("Alakazam", 27, "Psychic", 57));
		pokemons.add(new Pokemon("Charizard", 40, "Fire", 200));
		pokemons.add(new Pokemon("Gengar", 35, "Ghost", 120));
		int choice = 0;

		while (choice != 8) {

			System.out.println("""
					1 - Show all Pokémon
					2 - Show Pokémon sorted by level ascending
					3 - Show Pokémon sorted by level descending
					4 - Show Pokémon sorted by name
					5 - Show top 3 highest level Pokémon
					6 - Show only Pokémon names
					7 - Create a list of Fire Pokémon and show it
					8 - Exit""");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				pokemons.stream().forEach(pokemon -> pokemon.showPokemons());
				break;
			case 2:
				pokemons.stream().sorted(Comparator.comparingInt(pokemon -> pokemon.getLevel()))
						.forEach(pokemon -> pokemon.showPokemons());
				break;
			case 3:
				// Clean version :: instead of lambda ->
				pokemons.stream().sorted(Comparator.comparingInt(Pokemon::getLevel).reversed())
						.forEach(Pokemon::showPokemons);
				;
				break;
			case 4:
				pokemons.stream().sorted(Comparator.comparing(Pokemon::getName)).forEach(Pokemon::showPokemons);
				break;
			case 5:
				pokemons.stream().sorted(Comparator.comparing(Pokemon::getLevel).reversed()).limit(3)
						.forEach(Pokemon::showPokemons);
				break;
			case 6:
				pokemons.stream().map(Pokemon::getName).forEach(name -> System.out.println(name));
				break;
			case 7:
				pokemons.stream().filter(pokemon -> pokemon.getType().equalsIgnoreCase("Fire"))
						.collect(Collectors.toList()).forEach(Pokemon::showPokemons);
				;
				break;
			case 8:
				System.out.println("System closing.....");
				break;
			default:
				System.out.println("Wrong option, try again");
			}
		}

	}
}
