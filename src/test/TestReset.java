package test;

import org.junit.*;
import static org.junit.Assert.*;

import controllayer.*;
import modellayer.*;

/**
 * Inspired by the book: Flexible, Reliable Software Henrik B�rbak Christensen:
 * Flexible, Reliable Software. Taylor and Francis Group, LLC 2010
 */

public class TestReset {

	ControlPayStation ps;

	/** Fixture for pay station testing. */
	@Before
	public void setUp() {
		ps = new ControlPayStation();
	}

	/**
	 * Verify that the pay station is cleared and display shows 0 after a buy scenario
	 */
	@Test
	public void shouldClearAfterBuy() throws IllegalCoinException, Exception {
		ps.addPayment(1, Currency.ValidCurrency.EURO, Currency.ValidCoinType.INTEGER);
		
		ps.buy();
		
		assertEquals("Display should be 0 after buy", 0, ps.readDisplay());
	}

	/**
	 * Verify that cancel() clears the pay station
	 */
	@Test
	public void shouldClearAfterCancel() throws IllegalCoinException {
		ps.addPayment(1, Currency.ValidCurrency.EURO, Currency.ValidCoinType.INTEGER);
		
		ps.cancel();
		
		assertEquals("Display should be 0 after buy", 0, ps.readDisplay());
	}
}
