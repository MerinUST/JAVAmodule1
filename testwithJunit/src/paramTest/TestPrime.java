package paramTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.*;

@RunWith(Parameterized.class)
public class TestPrime{
	

private final Integer inputNumber;
private final Boolean expectedResult;
private PrimeNumber primeNumber;
@Before
public void initialize() {  
	primeNumber=new PrimeNumber();
}
public TestPrime(Integer inputNumber,Boolean expectedResult) {
	this.inputNumber=inputNumber;
	this.expectedResult=expectedResult;
}
@Parameterized.Parameters
public static Collection primeNumbers() {
	return Arrays.asList(new Object[][] {
		{2,true},{6,false},
		{19,true},
		{22,false},
		{23,true},
		{24,false}
		}
	);
}
	

	@Test
	public void testValidator() {
		System.out.println("Parameterized number is"+inputNumber);
		assertEquals(expectedResult,primeNumber.validate(inputNumber));
		
		//fail("Not yet implemented");
	}

}
