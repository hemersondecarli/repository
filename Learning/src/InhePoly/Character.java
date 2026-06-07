package InhePoly;

public class Character {
	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getHealth() {
		return health;
	}

	public void viewInfo() {
		System.out.println("Name: " + name + " level: " + level + " HP: " + health);
	}
	
	public void attack() {
		System.out.println("Character attacks");
	}

	private String name;
	private int level;
	private int health;

	public Character(String name, int level, int health) {
		this.name = name;
		this.level = level;
		this.health = health;
	}
}
