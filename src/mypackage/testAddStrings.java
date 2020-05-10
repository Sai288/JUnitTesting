package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunction junitstring= new JUnitFunction();
		String result=junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
