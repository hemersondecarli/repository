package InhePoly;

public class Mage extends Character {

	public Mage(String name, int level, int health) {
		super(name, level, health);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		System.out.println("Mage casts a fireball");
	}

}
