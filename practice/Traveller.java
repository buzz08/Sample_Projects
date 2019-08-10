package practice;

public class Traveller {
	public String name;
	public String id;
	public double fare;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getFare() {
		return fare;
	}
	public void setFar(double fare) {
		this.fare = fare;
	}
	
	//Constructor to set name and id from input
	Traveller(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	//To Caluclate the fare of the traveller
	public void calculateFare() {
		fare = 2000 + (2000*0.1136); 
	}
	
	//To Dispaly Traveller's details
	public void displayDetails() {
		calculateFare();
		System.out.println("Traveller Details");
		System.out.println("******************");
		System.out.println("Traveller name : "+ this.name);
		System.out.println("Traveller Id   : "+ this.id);
		System.out.println("Cost of Travel : "+ this.fare);
	}

}
