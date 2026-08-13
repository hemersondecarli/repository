package Employee;

public class Task {
	private String title;
	private String description;
	private String assignedEmployee;
	private String priority;
	private Status status;
	
	public enum Status {
		TODO,
		IN_PROGRESS,
		COMPLETED
	}
	
	public Task(String title, String description, String assignedEmployee, String priority, Status status) {
		this.title = title;
		this.description = description;
		this.assignedEmployee = assignedEmployee;
		this.priority = priority;
		this.status = status;
	}
	
	
	
	
}
