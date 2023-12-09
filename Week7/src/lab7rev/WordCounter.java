package lab7rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter {
	private final Map<String, Integer> wordMap= new HashMap<>();
	
	void addWord(String word) {
		if(wordMap.containsKey(word)) {
			int count= wordMap.get(word);
			wordMap.put(word, count+1);
		}
		else {
			wordMap.put(word, 1);
		}
		
	}
	
	void addSentence(String sentence) {
		String [] words= sentence.split(" ");
		for(String s: words) {
			addWord(s);
		}
	}
	
	void outputResults() {
		for(Entry<String, Integer> entry: wordMap.entrySet()) {
			String key= entry.getKey();
			int value= entry.getValue();
			System.out.println(key +" : "+ value);
		}
	}
}
