package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class PokeStatsSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Pokemon> pokemons = new ArrayList<>();

		pokemons.add(new Pokemon("Charmander", 10, "Fire", 100));
		pokemons.add(new Pokemon("Squirtle", 5, "Water", 30));
		pokemons.add(new Pokemon("Bulbasaur", 30, "Grass", 50));
		pokemons.add(new Pokemon("Pikachu", 3, "Thunder", 10));
		pokemons.add(new Pokemon("Alakazam", 27, "Psychic", 57));

		int choice = 0;

		while (choice != 9) {

			System.out.println("""
					1 - Show all Pokémon
					2 - Show lowest level Pokémon
					3 - Show highest health Pokémon
					4 - Calculate average Pokémon level
					5 - Calculate total Pokémon health
					6 - Show Pokémon names in uppercase
					7 - Create a list of Pokémon above level 20
					8 - Count Pokémon above level 20
					9 - Exit
								""");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				pokemons.stream().forEach(Pokemon::showPokemons);
				break;
			case 2:
				pokemons.stream().min(Comparator.comparingInt(Pokemon::getLevel)).ifPresent(Pokemon::showPokemons);
				break;
			case 3:
				pokemons.stream().max(Comparator.comparingInt(Pokemon::getHealth)).ifPresent(Pokemon::showPokemons);
				break;
			case 4:
				double average = pokemons.stream().mapToInt(pokemon -> pokemon.getLevel()).average().orElse(0);
				System.out.println("average is: "+average);
				break;
			case 5:
				System.out.println(pokemons.stream().mapToInt(Pokemon::getHealth).sum());
				break;
			case 6:
				pokemons.stream().map(Pokemon::getName).map(pokemon -> pokemon.toUpperCase())
						.forEach(pokemon -> System.out.println(pokemon));
				break;
			case 7:
				pokemons.stream().filter(pokemon -> pokemon.getLevel()>20).toList().forEach(Pokemon::showPokemons);
				break;
			case 8:
				System.out.println(pokemons.stream().filter(pokemon -> pokemon.getLevel()>20).count());
				break;
			case 9:
				System.out.println("System ending......");
			}
		}
	}

}
