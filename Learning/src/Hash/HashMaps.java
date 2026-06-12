package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<String, Integer> grade = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		int choice = 0;

		while (choice != 6) {
			System.out.println("""
					1 - Add student
					2 - Search student grade
					3 - Update student grade
					4 - Remove student
					5 - Show all students
					6 - Exit
										""");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter student name");
				String studentName = scanner.nextLine();
				System.out.println("Enter student grade");
				int studentGrade = scanner.nextInt();
				scanner.nextLine();

				grade.put(studentName, studentGrade);
				break;
			case 2:
				System.out.println("Enter student name");
				String studentNamee = scanner.nextLine();

				if (grade.containsKey(studentNamee)) {

					System.out.println(grade.get(studentNamee));
				} else {
					System.out.println("Student not found");
				}
				break;
			case 3:
				System.out.println("Enter student name");
				String stdName = scanner.nextLine();

				if (grade.containsKey(stdName)) {
					System.out.println("Enter new grade");
					int newGrade = scanner.nextInt();
					scanner.nextLine();

					grade.put(stdName, newGrade);
				} else {
					System.out.println("Student not found");
				}
				break;
			case 4:
				System.out.println("Enter student name to remove");
				String nameRemove = scanner.nextLine();

				if (grade.containsKey(nameRemove)) {
					grade.remove(nameRemove);
				}
				break;
			case 5:
//				for (String std : grade.keySet()) {
//					System.out.println(std);
//				}

				grade.entrySet().stream()
						.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Wrong option");
			}
		}
	}

}
