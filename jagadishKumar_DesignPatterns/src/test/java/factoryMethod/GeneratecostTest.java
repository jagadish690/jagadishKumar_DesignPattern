package factoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;


public class GeneratecostTest {

	@Test
	public void testCost() {
		GenerateCost testObject= new GenerateCost();
		assertEquals(2400.00,testObject.Cost("standard", 2),0);
	}
	@Test
	public void testCost1() {
		GenerateCost testObject= new GenerateCost();
		assertEquals(3000.00,testObject.Cost("Abovestandard", 2),0);
	}
	@Test
	public void testCost2() {
		GenerateCost testObject= new GenerateCost();
		assertEquals(3600.00,testObject.Cost("Highstandard", 2),0);
	}
	@Test
	public void testCost3() {
		GenerateCost testObject= new GenerateCost();
		assertEquals(5000.00,testObject.Cost("HighstandardFullautomatic", 2),0);
	}
}