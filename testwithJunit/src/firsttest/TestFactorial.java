package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFactorial {
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc=new Calculator();
		System.out.println("Before class");
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after executing all test");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void testFactorial() {
		int n=5;
		int expectedValue=120;
		int actualValue=calc.factorial(n);
		assertEquals(expectedValue,actualValue);
		//fail("Not yet implemented");
	}
	
	
}
