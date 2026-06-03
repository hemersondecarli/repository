package Try;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveReadNote {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		while (choice != 3) {
			System.out.println("""
					1 - Write a note
					2 - Read all notes
					3 - Exit
										""");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:
				try {
					FileWriter fw = new FileWriter("javaStudies.txt");
					String writeSomething = scanner.nextLine();
					
					fw.write(writeSomething);
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
		}
	}

}
