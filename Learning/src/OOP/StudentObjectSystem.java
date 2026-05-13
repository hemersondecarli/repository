package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private int age;
	private int grade;

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

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

	public void viewAll() {
		System.out.println("name: " + name + " age: " + age + " grade: " + grade);
	}
}

public class StudentObjectSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();

		int choice = 0;
		String studentName;
		int age;
		int grade;
		boolean case1 = false;
		boolean case2 = true;

		while (choice != 6) {
			System.out.println("1 -Add student");
			System.out.println("2 -Show all students");
			System.out.println("1 -Search student by name");
			System.out.println("1- Remove student by name");
			System.out.println("1- Update student grade");
			System.out.println("1- Exit");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Name: ");
				studentName = scanner.nextLine();
				System.out.print("Age: ");
				age = scanner.nextInt();
				System.out.print("Grade: ");
				grade = scanner.nextInt();

				for (Student std : students) {
					if (std.getName().equalsIgnoreCase(studentName)) {
						case1 = true;
						break;
					}
				}

				if (case1 == false) {
					Student student = new Student(studentName, age, grade);
					students.add(student);
					System.out.println("-Student was added-");

				} else if (case1 == true) {
					System.out.println("Student already exist");
				}
				break;

			case 2:
				for (Student allStudents : students) {
					if (students.contains(allStudents)) {

						allStudents.viewAll();
						case2 = false;
					}
				}
				if (case2 == true) {
					System.out.println("No students yet");
				}

				break;
			case 3:
				System.out.println("Enter name");
				studentName = scanner.nextLine();

				for (Student student : students) {
					if (student.getName().equalsIgnoreCase(studentName)) {
						student.viewAll();
						case2 = false;
						break;
					}
				}
				if (case2) {
					System.out.println("No students yet");
				}
				break;

			}
		}
	}

}
