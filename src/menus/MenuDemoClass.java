package menus;

import java.util.Scanner;

import menus.submenus.SubMenu1;
import menus.submenus.SubMenu2;

public class MenuDemoClass {
    
    private boolean exit; 
    private SubMenu1 subMenu1 = new SubMenu1();
    private SubMenu2 subMenu2 = new SubMenu2();
    
    private void printHeader() {
        System.out.println("+----------------------------------------------+");
        System.out.println("|                     Welcome to our           |");
        System.out.println("|                    Menu Application          |");
        System.out.println("+----------------------------------------------+");
        
    }
    
    private void printMenu() {
        System.out.println("\nPlease make a selection:  ");
        System.out.println("1. Tell me a color");
        System.out.println("2. Tell me a shape");
        System.out.println("3. Enter submenu 1");
        System.out.println("4. Enter submenu 2");
        System.out.println("0. Exit");
    }
       
    public void runMenu() {
        printHeader();
        while(!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }
    
    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 4) {
            try {
                System.out.print("\nEnter your choice:");
                choice = Integer.parseInt(sc.nextLine());
                
            } catch(NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
                
            }
            
        }
        
        return choice;
        
    }
    
    private void performAction(int choice) {
        switch(choice) {
            case 0:
                System.out.println("Thank you for using our application");
                this.exit = true;
                break;
            case 1:
                pickColor();
                break;
            case 2:
                pickShape();
                break;
            case 3:
                subMenu1.runMenu();
                this.exit = true;
                break;
            case 4:
                subMenu2.runMenu();
                this.exit = true;
                break;
             default:
                 System.out.println("An unknown error has occured.");
            
        }
    }
    
    private void pickColor() {
        int num = (int) (Math.random() * 4);
        switch(num) {
            case 0:
                System.out.println("Green");
                break;
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("White");
                break;
            default:    
                System.out.println("Black");
        }
    }
    
    private void pickShape() {
        int num = (int) (Math.random() * 4);
        switch(num) {
            case 0:
                System.out.println("Square");
                break;
            case 1:
                System.out.println("Circle");
                break;
            case 2:
                System.out.println("Triangle");
                break;
            case 3:
                System.out.println("Pyramid");
                break;
            default:    
        }
        
    }
    
    

    public static void main(String[] args) {
        
        MenuDemoClass menu = new MenuDemoClass();
        menu.runMenu();
        

    }

}
