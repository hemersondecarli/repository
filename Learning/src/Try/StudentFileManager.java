package Try;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentFileManager {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		int choice = 0;
		String name = null;
		int age = 0;
		int grade = 0;

		while (choice != 8) {

			System.out.println("""
					1 - Add student
					2 - Show all students
					3 - Save students to file
					4 - Load students from file
					5 - Search student by name
					6 - Remove student by name
					7 - Update student grade
					8 - Exit
										""");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				boolean nameExist = false;
				System.out.print("Enter name: ");
				name = scanner.nextLine();
				System.out.print("Enter age: ");
				age = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter grade: ");
				grade = scanner.nextInt();
				scanner.nextLine();

				for (Student stud : students) {
					if (stud.getName().contains(name)) {
						nameExist = true;
					}
				}
				if (nameExist) {
					System.out.println("Student is already registered");
					nameExist = false;
				} else {
					students.add(new Student(name, age, grade));
					System.out.println("Student has been added");
					nameExist = false;
				}

				break;
			case 2:
				if (students.isEmpty()) {
					System.out.println("No students in memory");
				} else {

					students.forEach(Student::viewInfo);
				}
				break;
			case 3:
				try {
					FileWriter fw = new FileWriter("students.txt");
					for (Student stud : students) {
						fw.write(stud.getName() + "," + stud.getAge() + "," + stud.getGrade());
					}
					fw.close();
				} catch (IOException e) {
					System.out.println("No students in file");
				}
				break;
			case 4:
				students.clear();
				String line;

				BufferedReader br;

				try {
					br = new BufferedReader(new FileReader("students.txt"));

					while ((line = br.readLine()) != null) {
						String[] parts = line.split(",");

						String studentName = parts[0].trim();
						int studentAge = Integer.parseInt(parts[1].trim());
						int studentGrade = Integer.parseInt(parts[2].trim());

						students.add(new Student(studentName, studentAge, studentGrade));

						students.forEach(Student::viewInfo);

					}
					System.out.println("Students load from the file");
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				boolean found = false;

				System.out.println("Enter student name to search");
				String searchStudent = scanner.nextLine();

				List<Student> results = students.stream().filter(student -> student.getName().contains(searchStudent))
						.toList();

				if (results.isEmpty()) {
					System.out.println("Student not found");
				} else {
					students.forEach(Student::viewInfo);
				}
				break;
			case 6:
				System.out.println("Enter student name to delete");
				String deleteStudent = scanner.nextLine();

				boolean exists = students.stream()
						.anyMatch(student -> student.getName().equalsIgnoreCase(deleteStudent));

				if (exists) {//deleting student
					students = students.stream().filter(student -> !student.getName().equalsIgnoreCase(deleteStudent))
							.collect(Collectors.toCollection(ArrayList::new));
					System.out.println("Student deleted");
				}
				else {
					System.out.println("student not found");
				}
				break;
			case 7:
				System.out.println("Enter student name to update grade");
				String nameN = scanner.nextLine();
				
				boolean existName = students.stream().anyMatch(student -> student.getName().equalsIgnoreCase(nameN));
				
				if(existName) {
					System.out.println("Enter new grade");
					int newGrade = scanner.nextInt();
					scanner.nextLine();
					students.stream().forEach(student -> student.setGrade(newGrade));
				}else {
					System.out.println("student not found");
				}
			}
		}
	}

}
