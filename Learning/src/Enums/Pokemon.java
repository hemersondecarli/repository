package Enums;

public class Pokemon {
	    private String name;
	    private int level;
	    private PokemonType type;
	    private int health;

	    public Pokemon(String name, int level, PokemonType type, int health) {
	        this.name = name;
	        this.level = level;
	        this.type = type;
	        this.health = health;
	    }

	    public PokemonType getType() {
	        return type;
	    }
	    
	    public int getLevel() {
	        return level;
	    }

	    public void showInfo() {
	        System.out.println("Name: " + name + " Level: " + level + " Type: " + type + " HP: " + health);
	    }
	}
