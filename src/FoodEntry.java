
public class FoodEntry {
	String dbaName;
	String akaName;
	String facilityType;
	String risk;
	String date;
	String latitude;
	String longitude;
	
	
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

	public FoodEntry(String dbaName,String facilityType,String risk,String date,String latitude,String longitude) {
		this.dbaName = dbaName;
		this.facilityType = facilityType;
		this.risk = risk;
		this.date = date;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String toString() {
		return("\""+dbaName+"\""+","+facilityType+","+risk+","+date+","+latitude+","+longitude+",\n");
	}
}
