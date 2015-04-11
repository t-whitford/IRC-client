package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSetUp {

	@Test
	public void test() {
		boolean result = Main.returnTrue();
		boolean expected = true;
		
		assertEquals(expected, result);
	}

}
