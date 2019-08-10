package practice;

public class SeniorTraveller extends Traveller {
	private int age;

	// Constructor to set name, id and age
	SeniorTraveller(String name, String id, int age) {
		// Invoking constructor from parent class
		super(name, id);
		this.age = age;
	}

	// Getters and Setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// overriding calculatefare method from Traveller Class
	public void calculateFare() {
		if (this.age <= 50 && this.age >= 65) {
			fare = 2000 * 0.9;
			fare += (fare * 0.1136);
		} else if (this.age > 65) {
			fare = 2000 * 0.85;
			fare += (fare * 0.1136);
		} else {
			fare = -1;
		}

	}
	
	// Displaying Senior traveller details
	public void displayDetails() {
		calculateFare();
		if(fare!=-1) {
			System.out.println("Senior Traveller Details");
			System.out.println("*************************");
			System.out.println("Traveller name : "+ name);
			System.out.println("Traveller Id   : "+ id);
			System.out.println("Cost of Travel : "+ fare);
		}else {
			System.out.println("Sorry "+name+", age should be 50 or more to avail senior traveller's concession");
		}
		
	}
	
	

}
