package databaselayer;

import modellayer.PPrice;
import modellayer.PZone;

public interface IDbPPrice {

	public PPrice getCurrentPrice();
    // Get Price by parking zone id
	public PPrice getPriceByZone(PZone zone) throws DatabaseLayerException;
    
}
