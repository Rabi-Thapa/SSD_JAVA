package lab7rev;

public class Driver {
	public static void main(String [] args) {
		WordCounter wc = new WordCounter();
		wc.addSentence("this this sentence has the word has in it twice");
		wc.outputResults();
		
		EmailStore em= new EmailStore();
		em.addEmail("rabi@gmail.com");
		em.addEmail("rabi@gmail.com");
		em.addEmail("rabi@gmail.com");
		
		System.out.println(em.hasEmail("rabi@gmail.com"));
		
		em.displayEmails();
	}
}
