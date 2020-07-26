package abstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;


public class DemaTest {

	@Test
	public void test() {
		Demo dOb=new Demo();
		assertEquals("Inside Rectangle::draw() method.",dOb.main(false, "Rectangle"));
	}
	@Test
	public void test1() {
		Demo dOb=new Demo();
		assertEquals("Inside Square::draw() method.",dOb.main(false, "SQUARE"));
	}
	@Test
	public void test2() {
		Demo dOb=new Demo();
		assertEquals("Inside RoundedRectangle::draw() method.",dOb.main(true, "Rectangle"));
	}
	@Test
	public void test3() {
		Demo dOb=new Demo();
		assertEquals("Inside RoundedSquare::draw() method.",dOb.main(true, "SQUARE"));
	}

}