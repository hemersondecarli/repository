package Employee;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Runnable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Task> tasks = new ArrayList<>();
		
		int choice = 0;
		
		while(choice != 9) {

		System.out.println("""
			====== Task Manager ======

				1. Add Employee
				2. Add Task
				3. View Employees
				4. View Tasks
				5. Assign Task
				6. Complete Task
				7. Search Task
				8. Remove Task
				9. Exit
				    			""");
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			int id = rand.nextInt(1, 100);
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			System.out.println("Enter your department: ");
			String department = scanner.nextLine();
		break;
		case 2:
		}
		}
		
	}
}