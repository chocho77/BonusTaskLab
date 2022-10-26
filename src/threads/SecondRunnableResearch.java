package threads;

import lab.Lab;

public class SecondRunnableResearch implements Runnable{
    
    private Lab lab = new Lab();
    
    
    public SecondRunnableResearch(Lab lab) {
        this.lab = lab;
    }
    
    

    @Override
    public void run() {
        
        for(int i = lab.getListOfMedicalTechnologist().size() / 2; i < lab.getListOfMedicalTechnologist().size(); i++) {
            System.out.println(Thread.currentThread().getName() + " " + "Medical Technologist Name : " 
                               + lab.getListOfMedicalTechnologist().get(i).getName() + 
                               " Medical Research : " + lab.getListOfResearch().get(i).getNameOfResearch() + 
                               " Pacient Name: " + lab.getListOfPacient().get(i).getName());
        }
        
    }
    

}
