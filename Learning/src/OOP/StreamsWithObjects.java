package OOP;

class Pokemon{
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

}
