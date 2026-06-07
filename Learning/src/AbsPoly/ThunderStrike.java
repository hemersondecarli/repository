package AbsPoly;

public class ThunderStrike extends Skill{

	public ThunderStrike(String name, int manaCost, int damage) {
		super(name, manaCost, damage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useSkill() {
		System.out.printf("Casting Thunder Strike! Deals %d lightning damage.\n", getDamage());
		
	}

}
