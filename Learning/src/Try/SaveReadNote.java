package Try;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
					FileWriter fw = new FileWriter("javaStudies.txt", true);
					System.out.println("Enter your note:");
					String writeSomething = scanner.nextLine();

					fw.write(writeSomething + "\n");

					fw.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
				break;
			case 2:
				BufferedReader br;
				try {
					br = new BufferedReader(new FileReader("javaStudies.txt"));
					String line;
					try {
						while ((line = br.readLine()) != null) {
							System.out.println(line);
						}
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					System.out.println("No notes found yet");
				}
				break;
			case 3:
				System.out.println("System closing....");
				break;
				

			}
		}
	}

}
