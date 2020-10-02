import java.util.ArrayList;
/**
 * Hospital system keep track of all patients
 * @author Linh Nguyen
 *
 */
public class HospitalSystem {
	private ArrayList<Patient> patient;
	private static HospitalSystem hospitalSystem;
	/**
	 * private constructor and initialize the "patient" array list
	 */
	private HospitalSystem() {
		patient = new ArrayList<Patient> ();
	}
	/**
	 * check if hospital system equals null, will create a new hospital system, then return instance of the class
	 * @return HospitalSystem
	 */
	public static HospitalSystem getInstance() {
		if (hospitalSystem == null) {
			hospitalSystem = new HospitalSystem();
		}
		return hospitalSystem;
	}
	/**
	 * create a new patient with given first name and last name and add it to the patient array list
	 * @param firstName of the patient
	 * @param lastName of the patient 
	 * @return the id of the patient which is the index of the array list
	 */
	public int addPatient(String firstName, String lastName) {
		int index = patient.size();
		index++;
		Patient newPatient = new Patient(index, firstName, lastName);
		patient.add(newPatient);
		return patient.indexOf(newPatient);
	}
	/**
	 * return the patient's information base on their id
	 * @param id of the patient
	 * @return patient record
	 */
	public Patient getRecord(int id) {
		return patient.get(id);
	}
	/**
	 * loop through the patient array list and find the id, if found the id, add allergy to the patient's record
	 * @param id of the patient 
	 * @param allergy which the patient have 
	 */
	public void addAllergy(int id, String allergy) {
		for (int i = 0; i < patient.size(); i++) {
			if(id == i) {
				getRecord(i).addAllergy(allergy);
			}
		}
	}
	/**
	 * This method print all the patients data and also utilize the toString method 
	 * @return result
	 */
	public String getAllPatientsData() {
		String result = "";
		for(int i = 0; i<patient.size(); i++) {
			result += patient.get(i).toString();
		}
		return result;
	}
}
