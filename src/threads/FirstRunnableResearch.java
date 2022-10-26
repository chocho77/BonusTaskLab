package threads;

import lab.Lab;

public class FirstRunnableResearch implements Runnable{
    
    private Lab lab = new Lab();
    
     public FirstRunnableResearch(Lab lab) {
        this.lab = lab;
    }
    

    @Override
    public void run() {
        
        for(int i = 0; i < lab.getListOfMedicalTechnologist().size()/2; i++) {
            try {
                Thread.currentThread();
                Thread.sleep(500);
            }catch(InterruptedException e) {
                e.printStackTrace();
                
            }
            System.out.println(Thread.currentThread().getName() +" " + "Medical Technologist Name : " 
                               + lab.getListOfMedicalTechnologist().get(i).getName() + 
                               " Medical Research : " + lab.getListOfResearch().get(i).getNameOfResearch() + 
                               " Pacient Name: " + lab.getListOfPacient().get(i).getName());
        }
        
        
    }
    
    
		

}
	

