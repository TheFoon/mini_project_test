package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import controllayer.ControlPayStation;
import controllayer.IllegalCoinException;
import databaselayer.DatabaseLayerException;
import modellayer.Currency;
import modellayer.PReceipt;

class TestBuyUseCase {

	ControlPayStation ps;

	@Test
	public void shouldNotBuyWithoutMoney() throws DatabaseLayerException {
		// Arrange
		ps = new ControlPayStation();
		
		// Act
		PReceipt receipt = ps.buy();
		
		// Assert
		assertNull(receipt, "Receipt should be null(no buy)");
	}


	/** Fixture for pay station testing. */
	@After
	public void cleanUp() {
		ps.setReady();
	}

}
