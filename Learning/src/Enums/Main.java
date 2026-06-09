package Enums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pokemon> pokemons = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		pokemons.add(new Pokemon("Charmander", 10, PokemonType.FIRE, 50));
		pokemons.add(new Pokemon("Squirtle", 5, PokemonType.WATER, 30));
		pokemons.add(new Pokemon("Bulbasaur", 30, PokemonType.GRASS, 50));
		pokemons.add(new Pokemon("Charizard", 5, PokemonType.FIRE, 90));

		int choice = 0;

		while (choice != 6) {
			System.out.println("""
					1 - Show all Pokémon
					2 - Show Fire Pokémon
					3 - Show Pokémon by chosen type
					4 - Count Pokémon by chosen type
					5 - Show strongest Pokémon
					6 - Exit
											""");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				pokemons.stream().forEach(Pokemon::showInfo);
				break;
			case 2:
				pokemons.stream().filter(pokemon -> pokemon.getType().equals(PokemonType.FIRE))
				.forEach(Pokemon::showInfo);
				break;
			case 3:
				System.out.println("Enter a type");
				String type = scanner.nextLine();
				
				try {
				pokemons.stream().filter(pokemon -> pokemon.getType().equals(PokemonType.valueOf(type.toUpperCase()))).forEach(Pokemon::showInfo);
				}catch(Exception e){
					System.out.println("Wrong type");
				}
				break;
			case 4:
				System.out.println("Enter a type");
				String chosenType = scanner.nextLine();
				
				Long poke = pokemons.stream().filter(pokemon -> pokemon.getType().equals(PokemonType.valueOf(chosenType.toUpperCase()))).count();
				
				System.out.println(poke);
				break;
			case 5:
				pokemons.stream().max(Comparator.comparingInt(pokemon -> pokemon.getLevel())).ifPresent(Pokemon::showInfo);
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Wrong option");
			}
		}
	}

}
