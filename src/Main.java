import java.util.ArrayList;
import java.util.Scanner;


public class Main {
//    public static ArrayList<Car> carLot = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a Car");
            System.out.println("2. View All Cars");
            System.out.println("3. Find a Car by License Plate");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Methods.addCar();
                    break;
                case 2:
                    Methods.viewAllCars();
                    break;
                case 3:
                    Methods.findCar();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }


}
