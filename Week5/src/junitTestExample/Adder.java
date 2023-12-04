package junitTestExample;

import java.util.ArrayList;
import java.util.List;

public class Adder {
	/*
	 * A list of values.
	 */
	private List<Integer> values= new ArrayList<Integer>();
	
	/*
	 * Adds a value to the list
	 * @Param value to be added
	 * @return the total number of values on the list
	 */
	int addValue(int value) {
		values.add(value);
		return values.size();
	}
	/*
	 * @return the total number of values on the list
	 * 
	 */
	int getTotal() {
		return values.size();
	}
	
	/*
	 * @return the average of the values on the list
	 */
	int getaverage() {
		int total=0;
		for(int i: values) {
			total +=i;
		}
		return total/ values.size();
	}

	Adder(){}
}
