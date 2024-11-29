import java.util.HashMap;
import java.util.Scanner;

class Employee {
    public Employee() {
    }
}

class Manager extends Employee {
    private HashMap<String, Boolean> leaveApproval = new HashMap<>();
    private HashMap<String, String> leaveRequests = new HashMap<>();

    public Manager() {
        super();
    }

    public void checkLeaveStatus() {
        System.out.println("Leave Approval Status:");
        for (String name : leaveApproval.keySet()) {
            System.out.println("Staff: " + name + ", Leave Approved: " + (leaveApproval.get(name) ? "Approved" : "Pending"));
        }
    }

    public void manageLeaves() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Leave Requests:");
        for (String name : leaveRequests.keySet()) {
            System.out.println("Staff: " + name + ", Date of Leave: " + leaveRequests.get(name));
        }
        System.out.println("Enter the name of the staff (type 'back' to go back): ");
        String name = scanner.nextLine();
        if (name.equals("back")) return;
        if (leaveRequests.containsKey(name)) {
            System.out.println("1. Approve");
            System.out.println("2. Reject");
            System.out.println("3. Exit to Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    leaveApproval.put(name, true);
                    leaveRequests.remove(name); // Remove leave request after approval
                    System.out.println("Leave approved for " + name);
                    break;
                case 2:
                    leaveApproval.put(name, false);
                    leaveRequests.remove(name); // Remove leave request after rejection
                    System.out.println("Leave rejected for " + name);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } else {
            System.out.println("Staff not found.");
        }
    }

    public void addLeaveRequest(String name, String dateOfLeave, String reason) {
        leaveRequests.put(name, dateOfLeave + ", Reason: " + reason);
    }
}

class Staff extends Employee {
    public String name;
    public String dateOfLeave;
    public String reason;

    public Staff(String name) {
        super();
        this.name = name;
    }

    public void applyForLeave() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date of leave: ");
        dateOfLeave = scanner.nextLine();
        System.out.print("Enter reason for leave: ");
        reason = scanner.nextLine();
        System.out.println("Leave application submitted.");
    }

    public void displayLeaveApplicationStatus() {
        System.out.println("Leave Application Status:");
        System.out.println("Name: " + name);
        System.out.println("Date of Leave: " + dateOfLeave);
        System.out.println("Reason: " + reason);
    }

    public String getName() {
        return name;
    }
}

public class LeaveManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static Manager manager = new Manager();
    private static HashMap<String, Staff> staffRegistry = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Manager Login");
            System.out.println("2. Staff Register");
            System.out.println("3. Staff Login");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    managerLogin();
                    break;
                case 2:
                    staffRegister();
                    break;
                case 3:
                    staffLogin();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void managerLogin() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("manager") && password.equals("manager")) {
            while (true) {
                System.out.println("\nManager Menu:");
                System.out.println("1. Check Leaves");
                System.out.println("2. Exit to Menu");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        manager.checkLeaveStatus();
                        manager.manageLeaves();
                        break;
                    case 2:
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }

    private static void staffRegister() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        staffRegistry.put(username, new Staff(username));
        System.out.println("Staff registered successfully.");
    }

    private static void staffLogin() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (staffRegistry.containsKey(username) && username.equals(password)) {
            Staff staff = staffRegistry.get(username);
            while (true) {
                System.out.println("\nStaff Menu:");
                System.out.println("1. Apply for Leave");
                System.out.println("2. Check Leave Application Status");
                System.out.println("3. Exit to Menu");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        staff.applyForLeave();
                        manager.addLeaveRequest(staff.getName(), staff.dateOfLeave, staff.reason);
                        break;
                    case 2:
                        staff.displayLeaveApplicationStatus();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            }
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }
}
