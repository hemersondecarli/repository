package Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayListAndHashMap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		HashMap<String, ArrayList<Integer>> students = new HashMap<>();

		int choice = 0;

		while (choice != 7) {
			System.out.println(
					"\n1 - add student \n2 - add grade to student \n3 - show grades of one student \n4 - calculate average of one student"
							+ "\n5 - show all students and grades \n6 - remove student \n7 - EXIT");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter Student name");
				String name = scanner.nextLine();
				if(!name.matches("[a-zA-Z]+")) {
					System.out.println("cannot register a student with those especial characters");
					}
					else if(!students.containsKey(name)) {
					// cannot leave it as null
					students.put(name, new ArrayList<>());
				}
				else {
					System.out.println("Student already registered on records");
				}
			
				break;
			case 2:
				System.out.println("Add grade to a student by entering his name");
				String studentName = scanner.nextLine();
				if (students.containsKey(studentName)) {
					System.out.print("enter new grade: ");
					int grade = scanner.nextInt();
					scanner.nextLine();
					students.get(studentName).add(grade);
				} else {
					System.out.println("student does not exist");
				}
				break;
			case 3:
				System.out.println("Enter student name to view grades");
				studentName = scanner.nextLine();
				if (students.containsKey(studentName)) {
					ArrayList<Integer> grades = students.get(studentName);
					if(grades.isEmpty()) {
						System.out.println("no grades yet");
					}else if(!grades.isEmpty()) {
						System.out.println(studentName+" grade is: "+ grades);	
					}
				} else {
					System.out.println("student does not exist");
				}
				break;
			case 4:
				System.out.println("enter student to calculate average");
				studentName = scanner.nextLine();

				if (students.containsKey(studentName)) {
					students.get(studentName);
					ArrayList<Integer> grades = students.get(studentName);

					// if grade is not empty
					if (!grades.isEmpty()) {

						int sum = 0;
						for (int grade : grades) {
							sum += grade;
						}

						double total = (double) sum / grades.size();

						System.out.println(total);

						// if grade is empty
					} else if (grades.isEmpty()) {
						System.out.println("No grades yet");
					}

				} else {
					System.out.println("student does not exist");
				}
				break;
			case 5:
				if (!students.isEmpty()) {

					for (String student : students.keySet()) {
						System.out.print(student + "\n");

						for (Integer studentGrade : students.get(student)) {
							System.out.println(studentGrade);
						}
					}
				}else {
					System.out.println("No Students nor grades");
				}
				break;
			case 6:
				System.out.println("enter student name to delete from records");
				studentName = scanner.nextLine();
				if(students.containsKey(studentName)) {
					students.remove(studentName);
				}else {
					System.out.println("Student does not exist");
				}
				break;
			case 7:
				System.out.println("Exiting.....");
				return;

			default:
				System.out.println("Option does not exist");
			}
		}
	}

}

/*
 * 1 - Add student 2 - Add grade to student 3 - Show grades of one student 4 -
 * Calculate average of one student 5 - Show all students and grades 6 - Remove
 * student 7 - Exit
 */