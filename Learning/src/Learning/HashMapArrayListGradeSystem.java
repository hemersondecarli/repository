package Learning;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class HashMapArrayListGradeSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<Integer>> students = new HashMap<>();

        int option = 0;

        while (option != 6) {

            System.out.println();
            System.out.println("1 - Add student");
            System.out.println("2 - Add grade to student");
            System.out.println("3 - Show student grades");
            System.out.println("4 - Show all students");
            System.out.println("5 - Calculate student average");
            System.out.println("6 - Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                // Add student
            	System.out.print("Enter student name: ");
            	String studentName = scanner.nextLine();
            	
            	if(students.containsKey(studentName)) {
            		System.out.println("Student already exists");
            	}else {
            		students.put(studentName, new ArrayList<>());
            	}

            } else if (option == 2) {
                // Add grade to student
            	System.out.println("Enter student name");
            	String name = scanner.nextLine();
            	
            	if(students.containsKey(name)) {
            		System.out.println("Enter result");
            		int grade = scanner.nextInt();
            		scanner.nextLine();
            		
            		students.get(name).add(grade);
            	}else {
            		System.out.println("Student not found");
            	}

            } else if (option == 3) {
                // Show student grades
            	System.out.println("Enter a student to view grade");
            	String studentGrade = scanner.nextLine();
            	
            	if(students.containsKey(studentGrade)) {
            		System.out.println(students.get(studentGrade));
            	}else {
            		System.out.println("Student does not exist");
            	}

            } else if (option == 4) {
                // Show all students
            	for(String student : students.keySet()) {
            		System.out.println(student +" "+students.get(student));
            	}

            } else if (option == 5) {
                System.out.println("Enter student name to get grade average");
                String name = scanner.nextLine();

                if (!students.containsKey(name)) {
                    System.out.println("Student not found");
                } else {
                    ArrayList<Integer> grades = students.get(name);

                    if (grades.isEmpty()) {
                        System.out.println("No grades yet");
                    } else {
                        int sum = 0;

                        for (int grade : grades) {
                            sum += grade;
                        }

                        double average = (double) sum / grades.size();

                        System.out.println("Average: " + average);
                    }
                }
            } else if (option == 6) {
                System.out.println("Exiting system...");

            } else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}