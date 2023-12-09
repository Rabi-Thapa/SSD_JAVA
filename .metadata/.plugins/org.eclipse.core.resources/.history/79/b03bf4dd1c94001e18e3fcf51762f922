package lab2;

public class WordProcessor implements Counter{
	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	/*
	 * Checks if the given is null or empty. It it is, returns the
	 * stored text; otherwise, returns the input sentence.
	 */
	public String check(String sentence) {
		if(sentence== null || sentence.isEmpty()) {
			return text;
		}
		return sentence;
	}
	
	

	 /*
     * Counts the number of words in the given sentence.
     */
	@Override
	public int countWords(String sentence) {
		sentence =check(sentence);
		String[] words= sentence.split(" ");
		int totalWords= words.length;
		return totalWords;
	}

	/*
     * Counts the number of letters in the given sentence.
     */
	@Override
	public int countLetters(String sentence) {
		check(sentence);
		int letters=0;
		for(int i=0; i<sentence.length(); i++) {
			if ( Character.isLetter(sentence.charAt(i)) )
				letters++;
		}
		return letters;
	}

	/*
	 * Returns the length of the given sentence.
	 */
	@Override
	public int getLength(String sentence) {
		sentence=check(sentence);
		int length = sentence.length();
		return length;
	}
}
