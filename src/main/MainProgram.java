package main;


//import lab.Lab;
import maindisplay.MainDisplayClass;
//import service.Service;
//import threads.FirstRunnableResearch;
//import threads.SecondRunnableResearch;

public class MainProgram {

	public static void main(String[] args) {
	
//	Lab lab = new Lab();
//	Service service = new Service();
//	lab = service.getInfoLab();
//	
//	Runnable  firstRunnableThread = new FirstRunnableResearch(lab);
//	Thread firstThread = new Thread(firstRunnableThread, "First Thread");
//	
//	Runnable secondRunnableThread = new SecondRunnableResearch(lab);
//	Thread secondThread = new Thread(secondRunnableThread, "Second Thread");
//	
//	firstThread.start();
//	try {
//	    firstThread.join();
//	} catch (InterruptedException e) {
//	    e.printStackTrace();
//	}
//	secondThread.start();
	    
	    MainDisplayClass mainDisplay = new MainDisplayClass();
	    mainDisplay.runMenu();
	    
		
	
	}

}
