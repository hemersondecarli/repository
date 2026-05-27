package Stream;

import java.util.ArrayList;
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
		pokemons.add(new Pokemon("bayleef", 90, "grass", 80));

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

			}

		}
	}

	public static void showAllPokemon(ArrayList<Pokemon> pokemons) {
		pokemons.stream().forEach(Pokemon::showPokemons);
	}

	

}
