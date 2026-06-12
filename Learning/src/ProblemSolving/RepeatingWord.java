package ProblemSolving;

import java.util.HashMap;

public class RepeatingWord {

	public static void main(String[] args) {

		String word = "swiss";

		HashMap<Character, Integer> charCount = new HashMap<>();

		// First loop: count characters
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);

			if (charCount.containsKey(letter)) {
				int oldCount = charCount.get(letter);
				/* get current count of letter */;
				charCount.put(letter, oldCount + 1);
				/* put letter back with oldCount + 1 */
			} else {
				/* put letter with count 1 */
				charCount.put(letter, 1);
			}
		}
		System.out.println(charCount);

		// Second loop: find the first non repeating character
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);

			if (charCount.get(letter) == 1) {
				System.out.println(letter);
				break;
			}
		}
	}

}
