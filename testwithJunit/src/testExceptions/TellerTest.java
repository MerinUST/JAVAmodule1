package testExceptions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TellerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	Teller teller=new Teller();
	@Test(expected=IllegalArgumentException.class)
	public void testValidateUnAcceptedCurrency() {
		teller.validateTransaction("AUSD", 100);
	}

	@Test(expected= InvalidTransactionAmountException.class)
	public void testValidateTransaction() {
		 Teller.validateTransaction("EUR",-100);
		//fail("Not yet implemented");
	}

}
