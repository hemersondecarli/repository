package Learning;

import java.util.HashMap;

public class CountingWordFrequency {

	public static void main(String[] args) {
		HashMap<String, Integer> wordCount = new HashMap<>();

		String sentence = "java is easy and java is powerful";
		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word);

			if (wordCount.containsKey(word)) {
				int oldCount = wordCount.get(word);
				wordCount.put(word, oldCount + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		System.out.println(wordCount);
	}

}
