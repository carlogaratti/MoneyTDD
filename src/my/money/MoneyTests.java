package my.money;

import static org.junit.Assert.*;

import org.junit.Test;


public class MoneyTests {
	
	@Test
	public void testMultiplication(){
		Dollar five = new Dollar(5);
		Dollar ten = five.times(2);
		assertEquals(10, ten.amount);
		Dollar fifteen = five.times(3);
		assertEquals(15, fifteen.amount);
	}
	
	@Test
	public void equality(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Dollar(6).equals(new Franc(6)));
	}

}
