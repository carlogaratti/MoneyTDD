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

}
