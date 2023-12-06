package lab2;

public interface Counter {
	/*
	 * @return the number of words from the sentence
	 */
	int countWords(String sentence);
	
	/*
	 * @return the total number of letters from sentence
	 */
	int countLetters(String sentence);
	
	/*
	 * @return length of sentence
	 */
	int getLength(String sentence);

}
