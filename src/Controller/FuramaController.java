package Controller;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }

    public void displayMainMenu() {
        int choice;
        do {
            System.out.println("---- FURAMA MANAGEMENT SYSTEM ----");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            choice = getUserChoice();

            switch (choice) {
                case 1:
                    displayEmployeeManagementMenu();
                    break;
                case 2:
                    displayCustomerManagementMenu();
                    break;
                case 3:
                    displayFacilityManagementMenu();
                    break;
                case 4:
                    displayBookingManagementMenu();
                    break;
                case 5:
                    displayPromotionManagementMenu();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                    break;
            }
        } while (choice != 6);
    }

    public void displayEmployeeManagementMenu() {
        int choice;
        do {
            System.out.println("---- EMPLOYEE MANAGEMENT MENU ----");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return to main menu");

            choice = getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("Displaying list of employees...");
                    // Code for displaying list of employees
                    break;
                case 2:
                    System.out.println("Adding a new employee...");
                    // Code for adding a new employee
                    break;
                case 3:
                    System.out.println("Editing an employee...");
                    // Code for editing an employee
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;
            }
        } while (choice != 4);
    }

    public void displayCustomerManagementMenu() {
        int choice;
        do {
            System.out.println("---- CUSTOMER MANAGEMENT MENU ----");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return to main menu");

            choice = getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("Displaying list of customers...");
                    // Code for displaying list of customers
                    break;
                case 2:
                    System.out.println("Adding a new customer...");
                    // Code for adding a new customer
                    break;
                case 3:
                    System.out.println("Editing a customer...");
                    // Code for editing a customer
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;
            }
        } while (choice != 4);
    }

    public void displayFacilityManagementMenu() {
        int choice;
        do {
            System.out.println("---- FACILITY MANAGEMENT MENU ----");
            System.out.println("1. Display list facilities");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return to main menu");

            choice = getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("Displaying list of facilities...");
                    // Code for displaying list of facilities
                    break;
                case 2:
                    System.out.println("Adding a new facility...");
                    // Code for adding a new facility
                    break;
                case 3:
                    System.out.println("Displaying list of facility maintenance...");
                    // Code for displaying list of facility maintenance
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;
            }
        } while (choice != 4);
    }

    public void displayBookingManagementMenu() {
        int choice;
        do {
            System.out.println("---- BOOKING MANAGEMENT MENU ----");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Return to main menu");

            choice = getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("Adding a new booking...");
                    // Code for adding a new booking
                    break;
                case 2:
                    System.out.println("Displaying list of bookings...");
                    // Code for displaying list of bookings
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                    break;
            }
        } while (choice != 3);
    }

    public void displayPromotionManagementMenu() {
        int choice;
        do {
            System.out.println("---- PROMOTION MANAGEMENT MENU ----");
            System.out.println("1. Display list promotions");
            System.out.println("2. Add new promotion");
            System.out.println("3. Return to main menu");

            choice = getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("Displaying list of promotions...");
                    // Code for displaying list of promotions
                    break;
                case 2:
                    System.out.println("Adding a new promotion...");
                    // Code for adding a new promotion
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                    break;
            }
        } while (choice != 3);
    }

    public int getUserChoice() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            choice = -1;
        }
        scanner.nextLine(); // Consume newline character
        return choice;
    }
}