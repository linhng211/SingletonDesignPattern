import java.util.ArrayList;
/**
 * Store informations of each patient in the system
 * @author Linh Nguyen
 *
 */
public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies;
	/**
	 * Constructor set up all the informations of the patient and declare a allergies array list
	 * @param id of the patient
	 * @param firstName of the patient
	 * @param lastName of the patient
	 */
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		allergies = new ArrayList<String>();
	}
	/**
	 * add new allergy to the allergies array list that each patient have 
	 * @param allergy which the patient have
	 */
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	/**
	 * print the informations of patient
	 * @return informations of patient included id, full name, and allergy if they have it
	 */
	public String toString() {	
		String arrListOutput = allergies.toString().replace("[" , "").replace("]" , "");
		if(allergies.size() > 0) {
			return "Patient " + this.id + ": " + this.firstName + " " + this.lastName + "\n" 
					+ "Allergies: " + arrListOutput + "\n" + "\n";
		}
		else 
		{
			return "Patient " + this.id + ": " + this.firstName + " " + this.lastName + "\n";
		}
	}
}
