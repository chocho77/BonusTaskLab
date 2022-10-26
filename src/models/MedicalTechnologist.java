package models;

public class MedicalTechnologist {
	
	private String name;
	private TypeOfResearch typeOfResearch;
	
	public MedicalTechnologist() {
		
	}

	public MedicalTechnologist(String name, TypeOfResearch typeOfResearch) {
		
		this.name = name;
		this.typeOfResearch = typeOfResearch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeOfResearch getTypeOfResearch() {
		return typeOfResearch;
	}

	public void setTypeOfResearch(TypeOfResearch typeOfResearch) {
		this.typeOfResearch = typeOfResearch;
	}
	
	
	
	
	
	
	
	

}
