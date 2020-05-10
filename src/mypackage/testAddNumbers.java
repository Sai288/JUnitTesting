package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunction junit= new JUnitFunction();
		int result=junit.addNumbers(100, 200);
		assertEquals(300,result);
	}

}
