package modellayer;

public class PZone {
	
	// Id of actual parkingzone
	private int id;
	private String name;

	// Hard coded value
	public PZone() {
		this.id = 2;
		this.name = "Zone B";
	}
	
	// Dynamicallt set parkingzone
	public PZone(int pZoneId, String pZoneName) {
		this.id = pZoneId;
		this.name = pZoneName;
	}	
	
	public int getpZoneId() {
		return id;
	}

	public void setpZoneId(int pZoneId) {
		this.id = pZoneId;
	}
	
	//TODO: Add getter/setter for name
	
}
