package InhePoly;

public class Warrior extends Character {

	public Warrior(String name, int level, int health) {
		super(name, level, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Warrior attacks with a sword");
	}
}
