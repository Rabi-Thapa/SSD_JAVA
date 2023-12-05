package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter {
	private final Map<String, Integer> wordMap= new HashMap<String, Integer>();
	
	void  addWord(String word) {
		if(wordMap.containsKey(word)) {
			int count= wordMap.get(word);
			wordMap.put(word, count+1);
		}
		else {
			wordMap.put(word, 1);
		}
	}
	
//	void addSentence(String sentence) {
//		String [] splitSent= sentence.split(" ");
//		for(int i=0; i<splitSent.length; i++) {
//			if(wordMap.containsKey(splitSent[i])) {
//				int count= wordMap.get(splitSent[i]);
//				wordMap.put(splitSent[i], count+1);
//			}
//			else {
//				wordMap.put(splitSent[i], 1);
//			}
//		}
//	}
	
	void addSentence(String sentence) {
		
	}
	
	
	void outputResults() {
		for(Entry<String, Integer> entry: wordMap.entrySet()) {
			String key= entry.getKey();
			Integer value= entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
	
	
}
