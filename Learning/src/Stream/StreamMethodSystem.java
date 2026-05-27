package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StreamMethodSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Pokemon> pokemons = new ArrayList<>();

		pokemons.add(new Pokemon("Charmander", 5, "fire", 100));
		pokemons.add(new Pokemon("Squirtle", 58, "water", 22));
		pokemons.add(new Pokemon("Pikachu", 44, "thunder", 44));
		pokemons.add(new Pokemon("Pidgey", 33, "wind", 33));
		pokemons.add(new Pokemon("Meowth", 35, "normal", 55));
		pokemons.add(new Pokemon("bayleef", 20, "grass", 80));

		int choice = 0;

		while (choice != 8) {
			System.out.println("""
					1 - Show all Pokémon
					2 - Show Pokémon above a chosen level
					3 - Show Pokémon by type
					4 - Show average level
					5 - Show total health
					6 - Show strongest Pokémon
					7 - Show Pokémon names only
					8 - Exit
										""");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				showAllPokemon(pokemons);
				break;
			case 2:
				System.out.println("Enter a level");
				int level = scanner.nextInt();
				scanner.nextLine();

				showPokemonAboveAChosenLevel(pokemons, level);
				break;
			case 3:
				System.out.println("Chose between fire - water - thunder - wind - normal - grass");
				String type = scanner.nextLine();

				showPokemonByType(pokemons, type);
				break;
			case 4:
				showAverageLevel(pokemons);
				break;
			case 5:
				showTotalHealth(pokemons);
				break;
			case 6:
				showStrongestPokemon(pokemons);
				break;
			case 7:
				showPokemonNameOnly(pokemons);
			}

		}
	}

	public static void showAllPokemon(ArrayList<Pokemon> pokemons) {
		pokemons.stream().forEach(Pokemon::showPokemons);
	}

	public static void showPokemonAboveAChosenLevel(ArrayList<Pokemon> pokemons, int level) {
		pokemons.stream().filter(pokemon -> pokemon.getLevel() > level).forEach(Pokemon::showPokemons);
	}

	public static void showPokemonByType(ArrayList<Pokemon> pokemons, String type) {
		pokemons.stream().filter(pokemon -> pokemon.getType().equalsIgnoreCase(type)).forEach(Pokemon::showPokemons);
	}

	public static void showAverageLevel(ArrayList<Pokemon> pokemons) {
		int value = pokemons.stream().mapToInt(pokemon -> pokemon.getLevel()).sum();

		double avg = value / pokemons.size();
		System.out.println("Average is: " + avg);
	}

	public static void showTotalHealth(ArrayList<Pokemon> pokemons) {
		int sum = pokemons.stream().mapToInt(pokemon -> pokemon.getHealth()).sum();
		System.out.println(sum);
	}

	public static void showStrongestPokemon(ArrayList<Pokemon> pokemons) {
		pokemons.stream().max(Comparator.comparingInt(Pokemon::getLevel)).ifPresent(Pokemon::showPokemons);
	}

	public static void showPokemonNameOnly(ArrayList<Pokemon> pokemons) {
		pokemons.stream().map(Pokemon::getName).map(pokemon -> pokemon.toUpperCase())
				.forEach(Pokemon -> System.out.println(Pokemon));
	}
}
