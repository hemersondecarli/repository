package Learning;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();

        int sum =0;
        // 1. Add 5 grades
        grades.add(5);
        grades.add(15);
        grades.add(45);
        grades.add(35);
        grades.add(50);

        // 2. Print all grades
        for (int grade : grades) {
        	System.out.println(grade);
        }

        // 3. Sum all grades
        for ( int grade : grades) {
        	 sum+=grade;
        }

        // 4. Print total sum
        	System.out.println("sum: "+sum);
        	
        // 5. Print how many grades exist
        	System.out.println("there are: "+grades.size()+" grades");
        	
        // 6. Calculate average
        	double average = (double) sum / grades.size();
        	System.out.println("average is: "+average);
    }
}