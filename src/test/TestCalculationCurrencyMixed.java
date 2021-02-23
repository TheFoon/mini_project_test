package test;

import org.junit.*;
import static org.junit.Assert.*;

import controllayer.*;
import modellayer.*;

/**
 * Inspired by the book: Flexible, Reliable Software Henrik B�rbak Christensen:
 * Flexible, Reliable Software. Taylor and Francis Group, LLC 2010
 */

public class TestCalculationCurrencyMixed {

	ControlPayStation ps;

	/** Fixture for pay station testing. */
	@Before
	public void setUp() {
		ps = new ControlPayStation();
	}

	/**
	 * Entering 1 cent and 50 �re should make the display report 4 minutes parking time.
	 */
	@Test
	public void shouldDisplay4MinFor1CentAnd50Ore() throws IllegalCoinException {
		// Arrange
		ControlPayStation payStation = new ControlPayStation();
		payStation.addPayment(1, Currency.ValidCurrency.EURO, Currency.ValidCoinType.FRACTION);
		payStation.addPayment(50, Currency.ValidCurrency.DKK, Currency.ValidCoinType.FRACTION);
		
		// Act
		int display = payStation.readDisplay();
		
		// Assert
		assertEquals("Dummy", 4, display);
	}


	/** Fixture for pay station testing. */
	@After
	public void cleanUp() {
		ps.setReady();
	}
	
}
