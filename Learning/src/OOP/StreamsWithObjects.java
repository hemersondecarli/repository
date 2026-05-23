package OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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

public class StreamsWithObjects {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Pokemon> pokemons = new ArrayList<>();

		pokemons.add(new Pokemon("Charmander", 10, "Fire", 100));
		pokemons.add(new Pokemon("Squirtle", 5, "Water", 30));
		pokemons.add(new Pokemon("Bulbasaur", 30, "Grass", 50));
		pokemons.add(new Pokemon("Pikachu", 3, "Thunder", 10));
		pokemons.add(new Pokemon("Alakazam", 27, "Psychic", 57));

		int choice = 0;

		while (choice != 8) {
			System.out.println("""
					[1] - Show all pokemon
					[2] - Show pokemon above level 10
					[3] - Show fire pokemon
					[4] - Count Water Pokémon
					[5] - Find Pokémon by name
					[6] - Show Pokémon with health below 100
					[7] - Show highest level Pokémon
					[8] - Exit
					""");
			
			System.out.println("Select an option");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				if (pokemons.isEmpty()) {
					System.out.println("No Pokemon registred");
				} else {
					pokemons.forEach(pokemon -> pokemon.showPokemons());
				}
				break;
			case 2:
				pokemons.stream().filter(pokemon -> pokemon.getLevel() >= 10)
						.forEach(pokemon -> pokemon.showPokemons());
				;

				if (pokemons.isEmpty()) {
					System.out.println("No pokemon above level 10");
				}
				break;
			case 3:
				boolean fireExist = pokemons.stream().anyMatch(pokemon -> pokemon.getType().equalsIgnoreCase("Fire"));

				if (fireExist == false) {
					System.out.println("No fire type pokemon");
				} else {
					pokemons.stream().filter(pokemon -> pokemon.getType().equalsIgnoreCase("Fire"))
							.forEach(pokemon -> pokemon.showPokemons());
				}
				break;
			case 4:
				boolean waterExist = pokemons.stream().anyMatch(pokemon -> pokemon.getType().equalsIgnoreCase("Water"));

				if (waterExist == true) {
					long waterCount = pokemons.stream().filter(pokemon -> pokemon.getType().equalsIgnoreCase("Water"))
							.count();
					System.out.println("There is: " + "[" + waterCount + "]" + " water type pokemons");
				} else {
					System.out.println("No water pokemon");
				}
				break;
			case 5:
				System.out.print("Enter pokemon name: ");
				String pokemonName = scanner.nextLine();

				boolean pokemonExist = pokemons.stream()
						.anyMatch(pokemon -> pokemon.getName().equalsIgnoreCase(pokemonName));

				if (pokemonExist) {
					pokemons.stream().filter(pokemon -> pokemon.getName().equalsIgnoreCase(pokemonName))
							.forEach(pokemon -> pokemon.showPokemons());
				} else {
					System.out.println("Pokemon not found");
				}
				break;
			case 6:
				pokemons.stream().filter(pokemon -> pokemon.getHealth() < 100)
						.forEach(pokemon -> pokemon.showPokemons());
				break;
			case 7:
				pokemons.stream().max(Comparator.comparingInt(pokemon -> pokemon.getLevel()))
						.ifPresent(pokemon -> pokemon.showPokemons());
				;
				break;
			case 8:
				System.out.println("System closing....");
				break;

			default:
				System.out.println("Wrong option");
			}
		}
	}

}
