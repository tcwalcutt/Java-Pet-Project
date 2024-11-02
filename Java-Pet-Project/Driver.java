import java.util.*;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    public static void main(String[] args) {
    	//prompts users input
        Scanner userInput = new Scanner(System.in);
    	
    	//calls initialization methods
        initializeDogList();
        initializeMonkeyList();
        
        boolean truth = true; 
        
        //loops through menu.
        while(truth) {
        	displayMenu();
        	String input = userInput.next();
        	switch(input) {
        	case "1":
        		intakeNewDog(userInput);
        		break;
        	case "2":
        		intakeNewMonkey(userInput);
        		break;
        	case "3":
        		reserveAnimal(userInput);
        		break;
        	case "4":
        		printAnimals("dog");
        		break;
        	case "5":
        		printAnimals("monkey");
        		break;
        	case "6":
        		printAnimals("available");
        		break;
        	case "q":
        		truth = false;
        		break;
        	default:
        		System.out.println("Not a valid option");
        	}
        }	
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    //Monkeys for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Tom", "male", "2", "5.6", "05-12-2023", "United States", "intake", false, "United States");
        Monkey monkey2 = new Monkey("Phil", "male", "4", "5.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Monkey monkey3 = new Monkey("Alex", "female", "2", "5.6", "12-12-2023", "Canada", "in service", false, "Canada");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.next();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // prompts user for input to instantiate new dog
        System.out.println("Enter following data: ");
        System.out.println("breed: ");
        String breed = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Gender: ");
        String gender = scanner.next();
        System.out.println("Age: ");
        String age = scanner.next();
        System.out.println("Weight: ");
        String weight = scanner.next();
        System.out.println("Acqusition date: ");
        String acquisitionDate = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Acqusition country: ");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Training status: ");
        String trainingStatus = scanner.nextLine();
        System.out.println("Reserved status: ");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("In service country: ");
        String inServiceCountry = scanner.nextLine();
        
        //instantiates new dog
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, 
        																trainingStatus, reserved, inServiceCountry);
        dogList.add(newDog);
        System.out.println("Dog added to our list.");
        return;
    }
    

        public static void intakeNewMonkey(Scanner scanner) {
        	//initializes counter and prompts user inputs
        	int counter = 0;
        	String[] speciesList = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"};
        	System.out.println("What is the monkey's name? ");
            String name = scanner.next();
            
            // checks if monkey is in list.
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //menu return
                }
            }
            // reads in monkey species
            System.out.println("What is the monkey's species? ");
            String species = scanner.next();
            
            
            //checks for valid species.
            for(String type: speciesList) {
            	if(!type.equalsIgnoreCase(species)) {
            		counter +=1;
            	}
            }
            if(counter == 6) {
            	System.out.println("\n\nNot a valid species for training\n\n");
            	return; // menu return
            }
            
            
            //gets user input on monkey data
            System.out.println("Enter following data: ");
            System.out.println("Gender: ");
            String gender = scanner.next();
            System.out.println("Age: ");
            String age = scanner.next();
            System.out.println("Weight: ");
            String weight = scanner.next();
            System.out.println("Acqusition date: ");
            String acquisitionDate = scanner.next();
            scanner.nextLine();
            System.out.println("Acqusition country: ");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("Training status: ");
            String trainingStatus = scanner.nextLine();
            System.out.println("Reserved status: ");
            boolean reserved = scanner.nextBoolean();
            scanner.nextLine();
            System.out.println("In service country: ");
            String inServiceCountry = scanner.nextLine();
            System.out.println("Tail length: ");
            int tailLength = scanner.nextInt();
            System.out.println("height: ");
            int height = scanner.nextInt();
            System.out.println("Body length: ");
            int bodyLength = scanner.nextInt();
            
            
            //instantiates new monkey
            Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, 
																trainingStatus, reserved, inServiceCountry);
            newMonkey.setTailLength(tailLength);
            newMonkey.setHeight(height);
            newMonkey.setBodyLength(bodyLength);
            newMonkey.setSpecies(species);
            monkeyList.add(newMonkey);

            System.out.println("Monkey has been added");
            return;
        }

        public static void reserveAnimal(Scanner scanner) {
        	// list of available names
        	ArrayList<Object> nameList = new ArrayList<Object>();
        	
        	//prompts user for animal type and country
            System.out.println("What Type of animal do you want to reserve: ");
            String type = scanner.next();
            scanner.nextLine();
            System.out.println("What Country are you in: ");
            String country = scanner.nextLine();
            //scanner.nextLine();
           
            //loops through dog list and prints out available dogs
            for(Dog dog: dogList) {
            	if(dog.getInServiceLocation().equalsIgnoreCase(country) && type.equalsIgnoreCase("dog")) {
            		if(dog.getReserved() == false && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
            			System.out.println("Name: " + dog.getName()
										+ "\nBreed: " + dog.getBreed()
										+ "\nAge: " + dog.getAge()
										+ "\nWeight " + dog.getWeight()
										+ "\nAcquisition Date: " + dog.getAcquisitionDate()
										+ "\nAcquisition Country: " + dog.getAcquisitionLocation()
										+ "\nTraining Status: " + dog.getTrainingStatus()
										+ "\nReserved Status: " + dog.getReserved()
										+ "\nIn Service Country: " + dog.getInServiceLocation());
            			System.out.println();
            			nameList.add(dog.getName());
            		}
                }
            }
            
            //loops through monkey list and prints out available monkeys
        	for(Monkey monkey: monkeyList) {
                if(monkey.getInServiceLocation().equalsIgnoreCase(country) && type.equalsIgnoreCase("monkey")) {
                	if(monkey.getReserved() == false && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                		System.out.println("Name: " + monkey.getName()
                						+ "\nSpecies: " + monkey.getSpecies()
										+ "\nAge: " + monkey.getAge()
										+ "\nWeight " + monkey.getWeight()
										+ "\nAcquisition Date: " + monkey.getAcquisitionDate()
										+ "\nAcquisition Country: " + monkey.getAcquisitionLocation()
										+ "\nTraining Status: " + monkey.getTrainingStatus()
										+ "\nReserved Status: " + monkey.getReserved()
										+ "\nIn Service Country: " + monkey.getInServiceLocation()
										+ "\nTail Length: " + monkey.getTailLength()
										+ "\nHeight: " + monkey.getTailLength()
										+ "\nBody Length: " + monkey.getBodyLength());
                		System.out.println();
                		nameList.add(monkey.getName());
                	}
                }
            }
        	if(nameList.size() == 0) {
        		System.out.println("No animal of that type available in this country.");
        	}
        	
        	
        	//prompts user for choice
        	for(Object name: nameList){
        		System.out.println(name.toString());
        		System.out.println("Which one do you want to reserve? ");
        		String nameChosen = scanner.nextLine();
        		
        		//reserves animal and displays confirmation
            	for(Dog dog: dogList) {
            		if(nameChosen.equalsIgnoreCase(dog.getName())){
            			dog.setReserved(true);
            			System.out.println("You have reserved: " + dog.getName());
            			
            		}
            	}
            	for(Monkey monkey: monkeyList) {
            		if(nameChosen.equalsIgnoreCase(monkey.getName())){
            			monkey.setReserved(true);
            			System.out.println("You have reserved: " + monkey.getName());
            		}
            	}
        	}
        	return;
        }


        // prints animal lists based on list type
        public static void printAnimals(String listType){  
        	
        	
        	
        	//checks list type and outputs correct data
        	switch(listType){
        		case "dog":
        			for(Dog dog: dogList) {
        			System.out.println("Name: " + dog.getName()
        							+ "\nBreed: " + dog.getBreed()
        							+ "\nAge: " + dog.getAge()
        							+ "\nWeight " + dog.getWeight()
        							+ "\nAcquisition Date: " + dog.getAcquisitionDate()
        							+ "\nAcquisition Country: " + dog.getAcquisitionLocation()
        							+ "\nTraining Status: " + dog.getTrainingStatus()
        							+ "\nReserved Status: " + dog.getReserved()
        							+ "\nIn Service Country: " + dog.getInServiceLocation());
        			System.out.println();
        			}
        			break;
        		case "monkey":
        			for(Monkey monkey: monkeyList) {
        				System.out.println("Name: " + monkey.getName()
										+ "\nSpecies: " + monkey.getSpecies()
										+ "\nAge: " + monkey.getAge()
										+ "\nWeight " + monkey.getWeight()
										+ "\nAcquisition Date: " + monkey.getAcquisitionDate()
										+ "\nAcquisition Country: " + monkey.getAcquisitionLocation()
										+ "\nTraining Status: " + monkey.getTrainingStatus()
										+ "\nReserved Status: " + monkey.getReserved()
										+ "\nIn Service Country: " + monkey.getInServiceLocation()
										+ "\nTail Length: " + monkey.getTailLength()
										+ "\nHeight: " + monkey.getTailLength()
										+ "\nBody Length: " + monkey.getBodyLength());
        				System.out.println();
        			}
        			break;
        		case "available":
        			for(Dog dog: dogList) {
                		if(dog.getReserved() == false && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                			System.out.println("Name: " + dog.getName()
											+ "\nBreed: " + dog.getBreed()
											+ "\nAge: " + dog.getAge()
											+ "\nWeight " + dog.getWeight()
											+ "\nAcquisition Date: " + dog.getAcquisitionDate()
											+ "\nAcquisition Country: " + dog.getAcquisitionLocation()
											+ "\nTraining Status: " + dog.getTrainingStatus()
											+ "\nReserved Status: " + dog.getReserved()
											+ "\nIn Service Country: " + dog.getInServiceLocation());
                			System.out.println();
                		}
                	}
        			for(Monkey monkey: monkeyList) {
        				if(monkey.getReserved() == false && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
        					System.out.println("Name: " + monkey.getName()
											+ "\nSpecies: " + monkey.getSpecies()
											+ "\nAge: " + monkey.getAge()
											+ "\nWeight " + monkey.getWeight()
											+ "\nAcquisition Date: " + monkey.getAcquisitionDate()
											+ "\nAcquisition Country: " + monkey.getAcquisitionLocation()
											+ "\nTraining Status: " + monkey.getTrainingStatus()
											+ "\nReserved Status: " + monkey.getReserved()
											+ "\nIn Service Country: " + monkey.getInServiceLocation()
											+ "\nTail Length: " + monkey.getTailLength()
											+ "\nHeight: " + monkey.getTailLength()
											+ "\nBody Length: " + monkey.getBodyLength());
        					System.out.println();
        				}
        			}
        			break;
        		
        	}
        }
       
}

