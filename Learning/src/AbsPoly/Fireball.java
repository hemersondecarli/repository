package AbsPoly;

public class Fireball extends Skill{

	public Fireball(String name, int manaCost, int damage) {
		super(name, manaCost, damage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useSkill() {
		System.out.printf("Casting fireball! it deals %d fire damage\n", getDamage());
		
	}

}
