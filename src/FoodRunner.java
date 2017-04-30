import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.opencsv.CSVParser;
import com.opencsv.CSVReader;


public class FoodRunner implements Runnable {
	String file;

	public FoodRunner(String file) {
		this.file = file;
	}

	@Override
	public void run() {
		CSVReader reader1 = null;

		ArrayList<FoodEntry> entries = new ArrayList<FoodEntry>();

		try {
			reader1 = new CSVReader(new FileReader(file), CSVParser.DEFAULT_SEPARATOR, CSVParser.DEFAULT_QUOTE_CHARACTER, 1);

			PrintWriter newCSVfile = new PrintWriter("C:\\Users\\kschool\\workspace\\FinalProject\\src\\foodEntries.csv");
			
			
			String[] record;
			while ((record = reader1.readNext()) != null) {

				String dbaName = record[1];
				//String akaName = record[2];
				String facilityType = record[4];
				String risk = record[5];
				String date = record[10];
				String latitude = record[14];
				String longitude = record[15];

				
				System.out.println(risk);
				String riskValue2 = risk.replaceAll("[^0-9]","");
				System.out.println(riskValue2);
				
				if(!(riskValue2 != null && !riskValue2.isEmpty())) {
					riskValue2 = "Unspecified";
				}
				
				if(!(facilityType != null && !facilityType.isEmpty())) {
					facilityType = "Unspecified";
				}
				
				if(!(date != null && !date.isEmpty())) {
					date = "Unspecified";
				}
				
				if(!(latitude != null && !latitude.isEmpty())) {
					latitude = "Unspecified";
				}
				
				if(!(longitude != null && !longitude.isEmpty())) {
					longitude = "Unspecified";
				}
				
				FoodEntry entry = new FoodEntry(dbaName, facilityType, riskValue2, date, latitude, longitude);
				entries.add(entry);

			}
			
			for(FoodEntry e: entries) {
				newCSVfile.write(e.toString());
			}
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
