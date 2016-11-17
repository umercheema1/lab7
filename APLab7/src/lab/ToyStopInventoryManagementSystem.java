package lab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fahad Satti
 */
public class ToyStopInventoryManagementSystem {
    public static ToyStopService tsService = new ToyStopService();
    public void init(){
        
        tsService.initEmployees();
        tsService.initStores();
        tsService.initToys();
        System.out.println("Init complete");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userRsp = new Scanner(System.in);
        Scanner userName = new Scanner(System.in);
        int num = 0;
        String name = null;
        ToyStopInventoryManagementSystem tsims = new ToyStopInventoryManagementSystem();
        tsims.init();
        
		//int temp;
		//string tempString;
        tsims.showMenu();
        while (true) {
        	tsims.showMenu();
	        switch(userRsp.nextInt()) {
	        case 6:
	        	System.out.println("Enter store Number to display");
	        	tsService.displayStore();
	        	System.out.println("Enter store Number to search it");
	        	tsService.searchStore(userRsp.nextInt());
	        	break;
	        case 7:
	        	tsService.displayEmployee();
	        	break;
	        case 8:
	        	System.out.println("Enter employee ID");
	        	num = userRsp.nextInt();
	        	tsService.searchEmployeeID(num);
	        	break;
	        case 9:
	        	System.out.println("Enter employee Name");
	        	name= userName.nextLine();
	        	tsService.searchEmployeeName(name);
	        	break;
	        }
        }
        //tsService.showToyDistribution();
        
        //tsims.printAll();
        
    }

    private void loadData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showMenu() {
        System.out.println("Welcome to Toy Stop Inventory Management System");
        System.out.println("Enter 1 to show all data");
        System.out.println("Enter 2 to add a new Store");
        System.out.println("Enter 3 to add a new Employee");
        System.out.println("Enter 4 to add a new Toy");
        System.out.println("Enter 5 to see Toys distribution");
        System.out.println("Enter 6 to search The Store");
        System.out.println("Enter 7 to display employees");
        System.out.println("Enter 8 to search The Employee using ID");
        System.out.println("Enter 9 to search The Employee using Name");
        System.out.println("Enter 10 to search The Employee using Name");
        System.out.println("Enter 0 to save state");
    }

    private void printAll() {
        System.out.println(this.tsService.stores.get(1));
    }
    
}
