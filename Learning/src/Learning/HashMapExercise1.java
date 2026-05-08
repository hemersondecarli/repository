package Learning;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();
        
        // 1. Add 5 students with grades
        students.put("Hemerson", 70);
        students.put("Jack", 55);
        students.put("Leo", 80);
        students.put("Adam", 25);
        students.put("Will", 91);

        // 2. Print all students and grades
        for(String stud : students.keySet()) {
        	System.out.println(stud + " grade is: "+students.get(stud));
        }
     
        // 3. Ask user to type a student name
        System.out.println("type a student name");
        String studentName = scanner.nextLine();
        
        // 4. Check if student exists
        for (String student : students.keySet()) {
        	if (students.containsKey(studentName)) {
        		System.out.println(studentName+": student found");
        		System.out.println("his grade is: "+students.get(studentName));
        		break;
        	      // 5. Print student grade or "Student not found"
        	}else if(students.isEmpty()) {
        		System.out.println("Student not found");
        	} else {
        		System.out.println("Error");
        	}
        }
        
        // 6. Update one student grade
        students.put("Hemerson", 90);

        // 7. Print final list
        for(String stud : students.keySet()) {
        	System.out.println(stud + " grade is: "+students.get(stud));
        }
     
        
        scanner.close();
    }
}