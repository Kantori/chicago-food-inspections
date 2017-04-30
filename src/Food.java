import java.util.ArrayList;

public class Food {

	public static void main(String[] args) {
		
		String file1 = "C:\\Users\\kschool\\Downloads\\Food_Inspections.csv";
		
		/** My machine uses only one core, so I am using one runner **/
		FoodRunner r1 = new FoodRunner(file1);
		r1.run();

	}

}
