package Employee;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Employee.Task.Status;

public class Runnable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Task> tasks = new ArrayList<>();

		int choice = 0;
		int id = 0;

		while (choice != 9) {

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
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter your name: ");
				String name = scanner.nextLine();
				System.out.println("Enter your department: ");
				String department = scanner.nextLine();
				id++;

				Employee employee = new Employee(id, name, department);
				employees.add(employee);

				break;
			case 2:
				System.out.println("Enter title");
				String title = scanner.nextLine();
				System.out.println("Task description");
				String taskDesc = scanner.nextLine();
				System.out.println("Assigned employee? ");
				String assignedEmployee = scanner.nextLine();
				System.out.println("Priority");
				String priority = scanner.nextLine();
				System.out.println("""
						Choose status:
						1. TODO
						2. IN_PROGRESS
						3. COMPLETED
						""");
				int statusChoice = scanner.nextInt();
				scanner.nextLine();
				
				Status status = null;
				
				
				switch (statusChoice) {
				
				case 1:
					status = Status.TODO;
					break;
				case 2:
					status = Status.IN_PROGRESS;
					break;
				case 3:
					status = Status.COMPLETED;
					break;
					default:
						status = Status.TODO;
				}

				Task task = new Task (title, taskDesc, assignedEmployee, priority, status);
				
				tasks.add(task);
				
				break;
			case 3:
				for (Employee emp : employees) {
					emp.showInfo();
				}
			}
		}

	}
}