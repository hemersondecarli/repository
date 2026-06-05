package Try;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	private String name;
	private int age;
	private int grade;

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public void viewInfo() {
		System.out.println("name: " + name + " age: " + age + " grade: " + grade);
	}
}

public class SaveStudentToFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();

		int choice = 0;
		String name = null;
		int age = 0;
		int grade = 0;

		while (choice != 5) {
			System.out.println("""
					1 - Add student
					2 - Show all students
					3 - Save students to file
					4 - Load students from file
					5 - Exit
										""");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("name");
				name = scanner.nextLine();
				System.out.println("age");
				age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("grade");
				grade = scanner.nextInt();
				scanner.nextLine();

				students.add(new Student(name, age, grade));
				break;
			case 2:
				if (students.isEmpty()) {
					System.out.println("No students in memory");
				} else {
					students.stream().forEach(Student::viewInfo);
				}
				break;
			case 3:
				try {
					FileWriter fw = new FileWriter("students.txt");
					for (Student student : students) {
						fw.write(student.getName() + "," + student.getAge() + "," + student.getGrade() + "\n");
					}
					fw.close();
				} catch (IOException e) {
					System.out.println("file could not be found");
				}
				break;
			case 4:
				try {
					BufferedReader br = new BufferedReader(new FileReader("students.txt"));

					students.clear();
					String line;

					while ((line = br.readLine()) != null) {
						String[] parts = line.split(",");

						String studentName = parts[0].trim();
						int studentAge = Integer.parseInt(parts[1].trim());
						int studentGrade = Integer.parseInt(parts[2].trim());

						students.add(new Student(studentName, studentAge, studentGrade));

						students.forEach(Student::viewInfo);
					}
					System.out.println("students load from the file");
					br.close();

				} catch (FileNotFoundException e) {

				} catch (IOException e) {

					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("System closing...");
				break;
			default:
				System.out.println("Wrong option");
			}

		}
	}

}
