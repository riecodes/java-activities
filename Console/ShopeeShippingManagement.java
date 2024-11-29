import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shipping {
  public static String id ;
  public static String origin;
  public static String destination;
  public static double weight;
  public static String status;

  public abstract void calculateCost();
  public abstract void track();
  public abstract void updateStatus();
}

class Parcel extends Shipping {
  public static double length;
  public static double width;
  public static double height;

  public Parcel() {
    super();
  }

  @Override
  public void calculateCost() {
    double cost = weight * 5 + length * width * height * 0.01;
    System.out.println("Parcel cost: $" + cost);
  }

  @Override
  public void track() {
    System.out.println("Tracking parcel: " + id + " from " + origin + " to " + destination);
  }

  @Override
  public void updateStatus() {
    System.out.println("Parcel status updated to: " + status);
  }

  public static void enterParcelDetails() {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Enter parcel ID: ");
      id = scanner.nextLine();
      System.out.print("Enter origin: ");
      origin = scanner.nextLine();
      System.out.print("Enter destination: ");
      destination = scanner.nextLine();
      System.out.print("Enter weight (kg): ");
      weight = scanner.nextDouble();
      System.out.print("Enter length (cm): ");
      length = scanner.nextDouble();
      System.out.print("Enter width (cm): ");
      width = scanner.nextDouble();
      System.out.print("Enter height (cm): ");
      height = scanner.nextDouble();
      scanner.nextLine(); // Consume newline left-over

      System.out.println("Select status: ");
      System.out.println("1. to ship");
      System.out.println("2. in transit");
      System.out.println("3. to receive");
      System.out.print("Enter status number: ");
      int statusChoice = scanner.nextInt();
      scanner.nextLine(); // Consume newline left-over

      switch (statusChoice) {
        case 1:
          status = "to ship";
          break;
        case 2:
          status = "in transit";
          break;
        case 3:
          status = "to receive";
          break;
        default:
          System.out.println("Invalid choice. Setting status to 'to ship'.");
          status = "to ship";
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid input type. Please enter the correct data type.");
      scanner.nextLine(); // Clear the buffer
      enterParcelDetails();
    }
  }
}

class Container extends Shipping {
    public static double volume;
    public static String containerType;
  
    public Container() {
      super();
    }
  
    @Override
    public void calculateCost() {
      double cost = weight * 10 + volume * 2;
      System.out.println("Container cost: PHP " + cost);
    }
  
    @Override
    public void track() {
      System.out.println("Tracking container: " + id + " from " + origin + " to " + destination);
    }
  
    @Override
    public void updateStatus() {
      System.out.println("Container status updated to: " + status);
    }
  
    public static void enterContainerDetails() {
      Scanner scanner = new Scanner(System.in);
      try {
        System.out.print("Enter container ID: ");
        id = scanner.nextLine();
        System.out.print("Enter weight (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Enter volume (cubic meters): ");
        volume = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter container type: ");
        containerType = scanner.nextLine();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input type. Please enter the correct data type.");
        scanner.nextLine(); // Clear the buffer
        enterContainerDetails();
      }
    }
  }
  
  class Freight extends Shipping {
    public static String cargoType;
    public static String transportationMode;
  
    public Freight() {
      super();
    }
  
    @Override
    public void calculateCost() {
      double cost = weight * 15 + (transportationMode.equals("air") ? 1000 : 500);
      System.out.println("Freight cost: PHP " + cost);
    }
  
    @Override
    public void track() {
      System.out.println("Tracking freight: " + id + " from " + origin + " to " + destination);
    }
  
    @Override
    public void updateStatus() {
      System.out.println("Freight status updated to: " + status);
    }
  
    public static void enterFreightDetails() {
      Scanner scanner = new Scanner(System.in);
      try {
        System.out.print("Enter freight ID: ");
        id = scanner.nextLine();
        System.out.print("Enter weight (kg): ");
        weight = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter cargo type: ");
        cargoType = scanner.nextLine();
        System.out.print("Enter transportation mode (air/sea): ");
        transportationMode = scanner.nextLine();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input type. Please enter the correct data type.");
        scanner.nextLine(); // Clear the buffer
        enterFreightDetails();
      }
    }
  }
  
  public class ShopeeShippingManagement {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
  
      // Parcel details
      Parcel parcel = new Parcel();
      Parcel.enterParcelDetails();
      parcel.calculateCost();
      parcel.track();
      parcel.updateStatus();
  
      while (true) {
        System.out.println("\nSelect the type of shipping:");
        System.out.println("1. Container");
        System.out.println("2. Freight");
        System.out.println("3. Both Container and Freight");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
  
        int choice;
        try {
          choice = scanner.nextInt();
          scanner.nextLine(); // Consume newline left-over
        } catch (InputMismatchException e) {
          System.out.println("Invalid input. Please enter a number between 1 and 4.");
          scanner.nextLine(); // Clear the buffer
          continue;
        }
  
        switch (choice) {
          case 1:
            Container.enterContainerDetails();
            Container container = new Container();
            container.calculateCost();
            container.track();
            container.updateStatus();
            finalDetails();
            return;
          case 2:
            Freight.enterFreightDetails();
            Freight freight = new Freight();
            freight.calculateCost();
            freight.track();
            freight.updateStatus();
            finalDetails();
            return;
          case 3:
            // Enter container details
            Container.enterContainerDetails();
            Container containerBoth = new Container();
            containerBoth.calculateCost();
            containerBoth.track();
            containerBoth.updateStatus();
  
            // Enter freight details
            Freight.enterFreightDetails();
            Freight freightBoth = new Freight();
            freightBoth.calculateCost();
            freightBoth.track();
            freightBoth.updateStatus();
            finalDetails();
            return;
          case 4:
            System.out.println("Exiting the program.");
            return;
          default:
            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
      }
  

    }
    
    public static void finalDetails() {
      System.out.println("Thank you for using the Shopee Shipping Management System.");
          // Display final information after choice (using static parcel variables)
        // Display final information
    System.out.println("\nFinal Information:");
    System.out.println("Parcel ID: " + Parcel.id);
    System.out.println("Origin: " + Parcel.origin);
    System.out.println("Destination: " + Parcel.destination);
    System.out.println("Parcel Status: " + Parcel.status);

      System.out.println("Container:");
      System.out.println("  ID: " + Container.id);
      System.out.println("  Weight: " + Container.weight + " kg");
      // Assuming volume is the relevant property for container
      System.out.println("  Volume: " + Container.volume + " cubic meters");
      System.out.println("  Type: " + Container.containerType);

      System.out.println("Freight:");
      System.out.println("  ID: " + Freight.id);
      System.out.println("  Weight: " + Freight.weight + " kg");
      System.out.println("  Cargo Type: " + Freight.cargoType);
      System.out.println("  Transportation Mode: " + Freight.transportationMode);
    }
  }
  