package controllayer;

import databaselayer.DatabaseLayerException;
import databaselayer.IDbPPrice;
import databaselayer.DatabasePPrice;
import modellayer.PPrice;
import modellayer.PZone;

public class ControlPrice {
	
	private IDbPPrice dbPrice;
	
	public ControlPrice() {
		this.dbPrice = new DatabasePPrice();
	}
	
	public PPrice getCurrentPrice() {
		
		PPrice currentPrice = new PPrice(); //hardcoded
		
		return currentPrice;
	}
	
	public PPrice getPriceRemote(PZone zone) throws DatabaseLayerException {
		
		// Get price from Parkingsystem DB
		PPrice readPrice = dbPrice.getPriceByZone(zone);
		//
		return readPrice;
	}

}
