package AbsPoly;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class RpgSkillSystem {

	public static void main(String[] args) {
		ArrayList<Skill> skills = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		skills.add(new Fireball("Fireball", 50, 90));
		skills.add(new Heal("Heal", 25, 60));
		skills.add(new ThunderStrike("Thunder Strike", 120, 80));

		int choice = 0;

		while (choice != 6) {
			System.out.println("""
					1 - Show all skills
					2 - Use all skills
					3 - Show skills with mana cost below 30
					4 - Show strongest skill
					5 - Search skill by name
					6 - Exit
										""");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				skills.forEach(Skill::viewInfo);
				break;
			case 2:
				skills.forEach(Skill::useSkill);
				break;
			case 3:
				skills.stream().filter(skill -> skill.getManaCost() < 30).forEach(Skill::viewInfo);
				break;
			case 4:
				skills.stream().max(Comparator.comparingInt(skill -> skill.getDamage())).ifPresent(Skill::viewInfo);
				break;
			case 5:
				System.out.print("Search skill by name: ");
				String skillName = scanner.nextLine();

			Skill found = skills.stream().filter(skill -> skill.getName().equalsIgnoreCase(skillName)).findFirst().orElse(null);
				if(found == null) {
					System.out.println("Skill not found");
				}else {
					found.viewInfo();
				}
				break;
			case 6:
				System.out.println("System closing...");
				break;
			default:
				System.out.println("Wrong option");
			}
		}
	}

}
