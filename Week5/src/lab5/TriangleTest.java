package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriangleTest {

	@Test
	void testEquilateralTriangle() {
		Triangle tri= new Triangle();
		assertTrue(tri.isEquilateral());
		
		tri= new Triangle(5);
		assertTrue(tri.isEquilateral());
		
		tri.setSides(9);
		assertTrue(tri.isEquilateral());
		
		
		tri.setSides(3, 4, 5);
		assertFalse(tri.isEquilateral());
	}
	
	@Test
	public void testIsoscelesTriangle() {
		Triangle tri= new Triangle();
		assertFalse(tri.isIsosceles());
		
		tri= new Triangle(9);
		assertFalse(tri.isIsosceles());
		
		tri.setSides(8, 5);
		assertTrue(tri.isIsosceles());
	}
	
	public void testScaleneTriangle() {
		Triangle tri= new Triangle(10, 11, 12);
		assertTrue(tri.isScalene());
		
		tri.setSides(8);
		assertFalse(tri.isScalene());
	}
	
	@ParameterizedTest
	@CsvSource({"1,2,3","4,5,6", "7,8,9"})
	public void testSetSides(int a, int b, int c) {
        Triangle triangle = new Triangle();
        triangle.setSides(a, b, c);
        assertEquals(a+b+c, triangle.getPerimeter());
        
        triangle.setSides(a);
        assertTrue(triangle.isEquilateral());
        
        triangle.setSides(a, b);
        assertTrue(triangle.isIsosceles());  
    }
	
	public void testDefalultConstructor() {
		Triangle tri= new Triangle();
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene()); 
		assertFalse(tri.isIsosceles());
	}
	
	@RepeatedTest(value = 5)
	void testAvgLength(RepetitionInfo repInf) {
		int repCount =repInf.getCurrentRepetition();
		Triangle tri= new Triangle(repCount, repCount *2, repCount *3);
		assertEquals((repCount+repCount *2 +repCount*3)/3, tri.getAverageLength());
	}
}
