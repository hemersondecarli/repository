package Learning;

import java.util.ArrayList;
import java.util.Scanner;

class Studentx {
	private String name;
	private int age;
	private int grade;

	public Studentx(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getGrade() {
		return grade;
	}

	public void viewInfo() {
		System.out.println("name: " + name + " age: " + age + " grade: " + grade);
	}

}

public class StudentListSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Studentx> students = new ArrayList<>();

		Studentx student1 = new Studentx("Hemerson", 29, 70);
		Studentx student2 = new Studentx("John", 19, 50);
		Studentx student3 = new Studentx("Carl", 39, 60);

		students.add(student1);
		students.add(student2);
		students.add(student3);

		for (Studentx studentz : students) {
			studentz.viewInfo();
		}

		boolean found = false;

		System.out.println("Enter student name");
		String searchName = scanner.nextLine();

		for (Studentx studentz : students) {
			if (studentz.getName().equalsIgnoreCase(searchName)) {
				System.out.println("Student found");
				studentz.viewInfo();
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("student not found");

		}
		scanner.close();

	}

}
