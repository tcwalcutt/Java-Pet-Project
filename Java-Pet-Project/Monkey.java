
public class Monkey extends RescueAnimal{
	//defines variables
	private int tailLength;
	private int height;
	private int bodyLength;
	private String species;
	
	//monkey constructor
	public Monkey(String name, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry){
		setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
		tailLength = -1;
		height = -1;
		bodyLength = -1;
		species = "";
	}
	
	//mutator and accessor methods for tail length
	public int getTailLength() {
		return tailLength;
	}
	public void setTailLength(int tLength){
		tailLength = tLength;
	}
	
	//mutator and accessor methods for height
	public int getHeight() {
		return height;
	}
	public void setHeight(int totalHeight){
		height = totalHeight;
	}
	
	//mutator and accessor methods for body length
	public int getBodyLength(){
		return bodyLength;
	}
	public void setBodyLength(int bLength){
		bodyLength = bLength;
	}
	
	//mutator and accessor methods for species
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String type){
		species = type;
	}
}
