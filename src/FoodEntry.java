
public class FoodEntry {
	String dbaName;
	String akaName;
	String facilityType;
	String risk;
	String date;
	String latitude;
	String longitude;
	String failure;
	String altRisk;
	String zip;
	
	
	public String getDbaName() {
		return dbaName;
	}

	public String getAkaName() {
		return akaName;
	}

	public String getFacilityType() {
		return facilityType;
	}

	public String getRisk() {
		return risk;
	}

	public String getDate() {
		return date;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public FoodEntry(String dbaName,String facilityType,String risk,String date,String latitude,String longitude, String failure, String altRisk, String zip) {
		this.dbaName = dbaName;
		this.facilityType = facilityType;
		this.risk = risk;
		this.date = date;
		this.latitude = latitude;
		this.longitude = longitude;
		this.failure = failure;
		this.altRisk = altRisk;
		this.zip = zip;
	}
	
	public String getZip() {
		return zip;
	}

	public String toString() {
		return("\""+dbaName+"\""+","+facilityType+","+risk+","+date+","+latitude+","+longitude+","+failure+","+altRisk+"," + zip + ",\n");
	}

	public String getFailure() {
		return failure;
	}

	public String getAltRisk() {
		return altRisk;
	}
}
