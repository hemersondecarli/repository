package AbsPoly;

public class Heal extends Skill{

	public Heal(String name, int manaCost, int damage) {
		super(name, manaCost, damage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useSkill() { //damage is treated as healing amount here
		System.out.printf("Casting Heal! Restores %d health.\n", getDamage());
		
	}

}
