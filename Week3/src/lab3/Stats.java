package lab3;

import java.util.Arrays;

public class Stats {

	// Array to store numbers
	private int[] numbers;

	// Variable to count the numbers of elements in array
	private int count;

	
	/**
	 * Adds a new value to the array and increments the count.
	 * @param value The value to be added to the array.
	 */

	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * @return The total number of elements in array
	 */
	public int getCount() {
		return numbers.length;
	}

	/**
	 * Retrieves the maximum value from the array of numbers.
	 * @return The maximum value in the array of numbers
	 * 
	 */
	public int findMaximumValue() {

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		return max;
	}

	/**
	 * Retrives the minimum value from the array of numbers.
	 * @return The minimum value in the array of numbers
	 */
	public int findMinimumValue() {
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}

	/*
	 * @return The total sum of the value of array
	 */
	public int calculateSum() {

		int total = 0;

		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

	/**
	 * 
	 * @return The average value from the array of numbers
	 */
	public double getAverage() {

		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}

		double avg = total / (double) numbers.length;

		return avg;
	}

	/**
	 * Returns a string representation of the array of numbers.
	 * @return A string representation of the array of numbers
	 */
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}

	/**
	 * Constructs a Stats object with the specified capacity.
	 * @param capacity The capacity of the 'numbers' array.
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}
}
