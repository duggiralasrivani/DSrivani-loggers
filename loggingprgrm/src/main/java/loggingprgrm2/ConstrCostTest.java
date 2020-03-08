package loggingprgrm2;

import static org.junit.Assert.*;

import org.junit.Test;


public class ConstrCostTest {

	@Test
	public void test() {
		HouseConst hc=new HouseConst();
		assertEquals(1254600,hc.Construct("HighStandMatrl",697));
	}
	@Test
	public void test2() {
		HouseConst hc=new HouseConst();
		assertEquals(388800,hc.Construct("StandMatrl",324));
	}
	@Test
	public void test3() {
		HouseConst hc=new HouseConst();
		assertEquals(850500,hc.Construct("AboveStandMatrl",567));
	}
	@Test
	public void test4() {
		HouseConst hc=new HouseConst();
		assertEquals(2107500,hc.Construct("HighStandMatrl,FullyAutomatedHome",843));
	}
}
