package loggingprgrm;

import static org.junit.Assert.*;

import org.junit.Test;


public class JunitTestCase {

	@Test
	public void test() {
		SimpleCompund sc=new SimpleCompund();

		assertEquals(270000,sc.simpleinterest(500000,3,18));
	}
	@Test
	public void test2() {
		SimpleCompund sc=new SimpleCompund();
		assertEquals(8000.0,sc.compoundinterest(5000,10,0.05,12),235.05);
	}

}
