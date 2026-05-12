package Learning;

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

	public int getAge() {
		return age;
	}


	public int getGrade() {
		return grade;
	}
	
	public void viewInfo() {
		 System.out.println("name: "+name+" age: "+age+" grade: "+grade);
		 
	
		
	}
	
}

public class StudentClassRevision {

	public static void main(String[] args) {
		Student student1 = new Student("Hemerson",29,70);
		Student student2 = new Student("John",25,40);
		Student student3 = new Student("Carl",22,60);
		

		student1.viewInfo();
		student2.viewInfo();
		student3.viewInfo();
	}

}
