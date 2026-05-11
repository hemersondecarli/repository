package Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentSubjectsSystem {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, ArrayList<String>> students = new HashMap<>();

		int choice = 0;

		while (choice != 7) {

			System.out.println();
			System.out.println("1 - Add student");
			System.out.println("2 - Add subject to student");
			System.out.println("3 - Remove subject from student");
			System.out.println("4 - Show subjects of one student");
			System.out.println("5 - Show all students and subjects");
			System.out.println("6 - Check if student is taking a subject");
			System.out.println("7 - Exit");
			System.out.print("Choose an option: ");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:
				// Add student
				System.out.println("enter name");
				String name = scanner.nextLine();
				if (students.containsKey(name)) {
					System.out.println("student already exist");
				} else {
					students.put(name, new ArrayList<>());
				}
				break;

			case 2:
				// Add subject to student
				System.out.println("enter student to add subject");
				name = scanner.nextLine();

				if (students.containsKey(name)) {
					System.out.println("enter subject");
					String subject = scanner.nextLine();

					if (!students.get(name).contains(subject)) {

						students.get(name).add(subject);
					} else {
						System.out.println("subject already exist");
					}
				}
				break;

			case 3:
				// Remove subject from student
				System.out.println("Enter student name");
				name = scanner.nextLine();

				if (students.containsKey(name)) {
					System.out.println("Enter subject to be deleted");
					String subject = scanner.nextLine();
					if (students.get(name).contains(subject)) {
						students.get(name).remove(subject);
						System.out.println(subject + " removed");
					} else {
						System.out.println("Subject not listed");
					}
				}
				break;

			case 4:
				// Show subjects of one student
				System.out.println("Enter student name");
				name = scanner.nextLine();
				if (students.containsKey(name)) {

					if (students.get(name).isEmpty()) {
						System.out.println("No subjects added yet");
					}
					for (String names : students.get(name)) {
						if (names.isEmpty()) {
							System.out.println("test");
						}
						System.out.println(names);

					}
				} else if (!students.containsKey(name)) {
					System.out.println("student does not exist");
				}
				break;

			case 5:
				// Show all students and subjects
				if (!students.keySet().isEmpty()) {

					for (String student : students.keySet()) {
						System.out.println(student);
						System.out.println(students.get(student));
					}
				}else {
					System.out.println("No Students on the list");
				}
				break;

			case 6:
			    // Check if student is taking a subject
			    System.out.println("Enter subject");
			    String checkSubject = scanner.nextLine();

			    for (String studentName : students.keySet()) {
			        ArrayList<String> subjects = students.get(studentName);

			        if (subjects.contains(checkSubject)) {
			            System.out.println(studentName + " is taking " + checkSubject);
			        }
			    }

			    break;
			

			case 7:
				System.out.println("Exiting system...");
				break;

			default:
				System.out.println("Invalid option");
			}
		}

		scanner.close();
	}
}