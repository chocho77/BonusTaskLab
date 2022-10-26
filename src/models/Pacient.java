package models;

public class Pacient {
	
	private String name;
	private double healthInsuranceAmount;
	
	public Pacient() {
		
	}

	public Pacient(String name, double healthInsuranceAmount) {
	
		this.name = name;
		this.healthInsuranceAmount = healthInsuranceAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealthInsuranceAmount() {
		return healthInsuranceAmount;
	}

	public void setHealthInsuranceAmount(double healthInsuranceAmount) {
		this.healthInsuranceAmount = healthInsuranceAmount;
	}

	public String getPacientInfo() {

		String returnInfoPacient  = "Pacient name : " + this.name + " health Insurance Amount : " + this.healthInsuranceAmount;

		return returnInfoPacient;

	}
	

}
