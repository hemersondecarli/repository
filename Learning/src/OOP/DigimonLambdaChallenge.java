package OOP;

import java.util.ArrayList;

public class DigimonLambdaChallenge {

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

	public static void main(String[] args) {
		ArrayList<Digimon> digimons = new ArrayList<>();

	}

}
