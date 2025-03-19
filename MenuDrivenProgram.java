import java.util.Scanner;
public class MenuDrivenProgram {
    
    public static void displayMenu() {
        System.out.println("Menu: ");
        System.out.println("1.Greet user");
        System.out.println("2.Check Even/Odd");
        System.out.println("3.Exit");
    }
    
    public static void greetUser () {
        System.out.println("Hello Welcome!");
    }
    public static void checkEvenOrOdd () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter an Integer: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
    
    public static boolean handleMenuChoice (int choice) {
        
        switch (choice) {
            case 1: 
                greetUser();
                return false;
           case 2:
                checkEvenOrOdd();
                return false;
            case 3:
                System.out.println("Exiting program. GoodBye!");
                return true;
            default:
            System.out.println("Invalid Choice. Please Enter 1, 2, or 3.");
            return false;
        }
    }            
    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    boolean exitProgram = false;
	    
	    while (!exitProgram) {
	        displayMenu();
	        System.out.println("Enter your choice(1-3): ");
	        int choice = scanner.nextInt();
	        exitProgram = handleMenuChoice(choice);
	    }
		scanner.close();
	}
}