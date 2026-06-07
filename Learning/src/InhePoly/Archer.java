package InhePoly;

public class Archer extends Character{

	public Archer(String name, int level, int health) {
		super(name, level, health);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		System.out.println("Archer shoots an arrow");
	}

}
