package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Quest {
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDificulty() {
		return dificulty;
	}

	public void setDificulty(String dificulty) {
		this.dificulty = dificulty;
	}

	public int getRewardGold() {
		return rewardGold;
	}

	public void setRewardGold(int rewardGold) {
		this.rewardGold = rewardGold;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	private String title;
	private String dificulty;
	private int rewardGold;
	boolean completed;

	public Quest(String title, String dificulty, int rewardGold, boolean completed) {
		this.title = title;
		this.dificulty = dificulty;
		this.rewardGold = rewardGold;
		this.completed = completed;
	}

	public void viewInfo() {
		System.out.println(
				"title: " + title + " dificulty: " + dificulty + " reward: " + rewardGold + " completed? " + completed);
	}
}

public class GameQuestListLambda {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Quest> quests = new ArrayList<>();

		quests.add(new Quest("Defeat Goblins", "Easy", 100, true));
		quests.add(new Quest("Dragon Cave", "Hard", 1000, false));
		quests.add(new Quest("Find Lost Ring", "Easy", 150, false));
		quests.add(new Quest("Rescue Villager", "Medium", 400, true));
		quests.add(new Quest("Ancient Ruins", "Hard", 800, true));

		int option = 0;

		while (option != 8) {

			System.out.println();
			System.out.println("1 - Show all quests");
			System.out.println("2 - Show completed quests");
			System.out.println("3 - Show incomplete quests");
			System.out.println("4 - Show hard quests");
			System.out.println("5 - Show quests with reward above 500 gold");
			System.out.println("6 - Count completed quests");
			System.out.println("7 - Search quest by title");
			System.out.println("8 - Exit");
			System.out.print("Choose an option: ");

			option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {

			case 1:
				// Show all quests
				quests.forEach(quest -> quest.viewInfo());
				break;

			case 2:
				// Show completed quests

				quests.forEach(quest -> {
					if (quest.isCompleted()) {
						quest.viewInfo();
					}
				});

				break;

			case 3:
				// Show incomplete quests
				quests.forEach(quest -> {
					if (quest.isCompleted()==false) {
						quest.viewInfo();
					}
				});

				break;

			case 4:
				// Show hard quests
				quests.forEach(quest -> {
					if (quest.getDificulty().equalsIgnoreCase("Hard")) {
						quest.viewInfo();
					}
				});

				break;

			case 5:
				// Show quests with reward above 500 gold
				int gold = 500;
				quests.forEach(quest -> {
					if (quest.getRewardGold() >= gold) {
						quest.viewInfo();
					}
				});
				break;

			case 6:
				// Count completed quests
				//Streams
				int counter = (int) quests.stream().filter(Quest::isCompleted).count();
				
				System.out.println("Number of completed quests: "+counter);
				break;

			case 7:
				// Search quest by title
				System.out.println("Enter title to search quest");
				String title = scanner.nextLine();
				quests.forEach(quest ->{
					if(quest.getTitle().equalsIgnoreCase(title)) {
						quest.viewInfo();
					}
				});
				break;

			case 8:
				System.out.println("Exiting system...");
				break;

			default:
				System.out.println("Invalid option");
			}
		}
	}

}
