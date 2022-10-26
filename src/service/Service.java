package service;

import java.util.ArrayList;
import java.util.List;

import lab.Lab;
import models.MedicalTechnologist;
import models.Pacient;
import models.TypeOfResearch;

public class Service {
    
    public Service() {
        
    }
    
    public Lab getInfoLab() {
        
        TypeOfResearch typeOfResearchOne = new TypeOfResearch("Search name one", 45.0);
        TypeOfResearch typeOfResearchTwo = new TypeOfResearch("Search name two", 34.45);
        TypeOfResearch typeOfResearchThree = new TypeOfResearch("Search name three", 65.45);
        TypeOfResearch typeOfResearchFour = new TypeOfResearch("Search name four", 123.22);
        //////////////////
        List<TypeOfResearch> listOfResearch= new ArrayList<>();
        listOfResearch.add(typeOfResearchOne);
        listOfResearch.add(typeOfResearchTwo);
        listOfResearch.add(typeOfResearchThree);
        listOfResearch.add(typeOfResearchFour);
        ////////////
        MedicalTechnologist medicalTechnologistOne = new MedicalTechnologist("Kaloyan", typeOfResearchOne);
        MedicalTechnologist medicalTechnologistTwo = new MedicalTechnologist("Stoyan", typeOfResearchTwo);
        MedicalTechnologist medicalTechnologistThree = new MedicalTechnologist("Todor", typeOfResearchThree);
        MedicalTechnologist medicalTechnologistFour = new MedicalTechnologist("Trajan", typeOfResearchFour);
        ///////////////
        List<MedicalTechnologist> listOfMedicalTechnologist = new ArrayList<>();
        listOfMedicalTechnologist.add(medicalTechnologistOne);
        listOfMedicalTechnologist.add(medicalTechnologistTwo);
        listOfMedicalTechnologist.add(medicalTechnologistThree);
        listOfMedicalTechnologist.add(medicalTechnologistFour);
        ///////////////////////////////
        Pacient pacient = new Pacient("Pesho", 2123.45);
        Pacient pacientOne = new Pacient("Gosho", 3456.67);
        Pacient pacientThree = new Pacient("Misho", 7890.78);
        Pacient pacientFour = new Pacient("Kristiyan", 2456.43);
        ////////////////////////////////////////////////
        List<Pacient> listOfPacient = new ArrayList<>();
        listOfPacient.add(pacient);
        listOfPacient.add(pacientOne);
        listOfPacient.add(pacientThree);
        listOfPacient.add(pacientFour);
        /////////////////////////////////////////////////////
        
        Lab lab = new Lab("City Clinick",listOfResearch,listOfMedicalTechnologist,listOfPacient);
        
        return lab;
        
    }
    

}
