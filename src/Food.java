
public class Food {

	public static void main(String[] args) {
		
		String file1 = "C:\\Users\\Shubham\\Downloads\\Food_Inspections.csv";
		
		/** My machine uses only one core, so I am using one runner **/
		FoodRunner runner = new FoodRunner(file1);
		runner.run();
		
	}

}
