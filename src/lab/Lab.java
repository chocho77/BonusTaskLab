package lab;

import java.util.ArrayList;
import java.util.List;

import models.MedicalTechnologist;
import models.Pacient;
import models.TypeOfResearch;

public class Lab {
	
	private String nameOfLab;
	private List<TypeOfResearch> listOfResearch= new ArrayList<>();
	private List<MedicalTechnologist> listOfMedicalTechnologist = new ArrayList<>();
	private List<Pacient> listOfPacient = new ArrayList<>();
	
	public Lab() {
		
	}

	public Lab(String nameOfLab, List<TypeOfResearch> listOfResearch,
			List<MedicalTechnologist> listOfMedicalTechnologist, List<Pacient> listOfPacient) {
		
		this.nameOfLab = nameOfLab;
		this.listOfResearch = listOfResearch;
		this.listOfMedicalTechnologist = listOfMedicalTechnologist;
		this.listOfPacient = listOfPacient;
	}

	public String getNameOfLab() {
		return nameOfLab;
	}

	public void setNameOfLab(String nameOfLab) {
		this.nameOfLab = nameOfLab;
	}

	
	public List<TypeOfResearch> getListOfResearch() {
		return listOfResearch;
	}

	public void setListOfResearch(List<TypeOfResearch> listOfResearch) {
		this.listOfResearch = listOfResearch;
	}

	public List<MedicalTechnologist> getListOfMedicalTechnologist() {
		return listOfMedicalTechnologist;
	}

	public void setListOfMedicalTechnologist(List<MedicalTechnologist> listOfMedicalTechnologist) {
		this.listOfMedicalTechnologist = listOfMedicalTechnologist;
	}

	public List<Pacient> getListOfPacient() {
		return listOfPacient;
	}

	public void setListOfPacient(List<Pacient> listOfPacient) {
		this.listOfPacient = listOfPacient;
	}
	
	public void getInfo() {
	    for(int i = 0; i < this.listOfMedicalTechnologist.size();i++) {
	        System.out.println("Medical Technologist Name : " 
	                           + this.listOfMedicalTechnologist.get(i).getName() + 
	                           " Medical Research : " + this.listOfResearch.get(i).getNameOfResearch() + 
	                           " Pacient Name: " + this.listOfPacient.get(i).getName());
	    }
	}
	

}
