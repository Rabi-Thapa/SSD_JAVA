package junitTestExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class AdderTest {

	@Test
	void testNewAdder() {
		
		Adder obj= new Adder();
		
		int total= obj.getTotal();
		
		assertEquals(0, total);
	}
	
	@Test
	void  testAddValue() {
		Adder obj= new Adder();
		int count= obj.addValue(10);
		assertEquals(1, count);
		
		count= obj.addValue(20);
		assertEquals(2, count);
		
		count= obj.addValue(30);
		assertEquals(4, count, "The count should have been 3");
		
		int total= obj.getTotal();
		assertEquals(3, total);
		
		assertTrue(3 == total);
		assertFalse(3 != total);
		
		assertNotNull(obj);
	}
	
	@RepeatedTest(100)
	void testAverage(RepetitionInfo refInfo) {
		int repCount= refInfo.getCurrentRepetition();
		
		Adder obj= new Adder();
		obj.addValue(repCount);
		obj.addValue(30);
		
		assertEquals((repCount+30)/2, obj.getaverage());
		
	}

}
