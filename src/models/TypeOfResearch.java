package models;

public class TypeOfResearch {
	
	private String nameOfResearch;
	private double priceOfResearch;
	
	public TypeOfResearch() {
		
	}

	public TypeOfResearch(String nameOfResearch, double priceOfResearch) {
		
		this.nameOfResearch = nameOfResearch;
		this.priceOfResearch = priceOfResearch;
	}

	public String getNameOfResearch() {
		return nameOfResearch;
	}

	public void setNameOfResearch(String nameOfResearch) {
		this.nameOfResearch = nameOfResearch;
	}

	public double getPriceOfResearch() {
		return priceOfResearch;
	}

	public void setPriceOfResearch(double priceOfResearch) {
		this.priceOfResearch = priceOfResearch;
	}
	
	
	
	
	
	

}
