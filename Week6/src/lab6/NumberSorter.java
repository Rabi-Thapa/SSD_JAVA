package lab6;

import java.util.Iterator;
import java.util.Stack;

public class NumberSorter {
	void sort(int [] numbers) {
		System.out.println("\n");
		
		// The source stack, from which the numbers are popped
		Stack<Integer> srcStack= new Stack<Integer>();
		
		
		//The dest stack, to which the numbers are pushed
		Stack<Integer> destStack= new Stack<Integer>();
		
		
		// Add the initial array of numbers to the source stack.
		for(int number: numbers) {
			srcStack.push(number);
		}
		
	
		// bulk of code goes here (hint: use while loops rather than if's
		while(srcStack.size()>0) {
			Integer next= srcStack.pop();
			while(destStack.size()>0 && (destStack.peek()> next)) {
				srcStack.push(destStack.pop());
			}
			destStack.push(next);
		}
		Iterator<Integer> iter= destStack.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("\n");
	}
	
	
	
	void sort(int [] numbers, boolean ascending) {
		if(ascending) {
			sort(numbers);
		}
		else {
			System.out.println("Descending order");
			Stack<Integer> srcStack= new Stack<>();
			Stack<Integer> destStack= new Stack<>();
			
			for(int n: numbers) {
				srcStack.push(n);
			}
			
			while(!srcStack.isEmpty()) {
				Integer next= srcStack.pop();
				while(!destStack.isEmpty() && (destStack.peek()<next)) {
					srcStack.push(destStack.pop());
				}
				destStack.push(next);
			}
			
			Iterator<Integer> iter= destStack.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			System.out.println("\n");
		}
	}
}
