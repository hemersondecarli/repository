package AbsPoly;

public abstract class Skill {

	private String name;
	private int manaCost;
	private int damage;

	public Skill(String name, int manaCost, int damage) {
		this.name = name;
		this.manaCost = manaCost;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public int getManaCost() {
		return manaCost;
	}

	public int getDamage() {
		return damage;
	}

	public void viewInfo() {
		System.out.println("name: " + name + " - mana cost: " + manaCost + " - damage: " + damage);
	}
	
	public abstract void useSkill();

}
