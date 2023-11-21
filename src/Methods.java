import java.util.*;

public class Methods {
    private static final ArrayList<Car> carLot = new ArrayList<>();
    public static void addCar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter License Plate:");
        String licensePlate = scanner.next();

        System.out.println("Enter color:");
        String color = scanner.next();

        System.out.println("Enter Model:");
        String model = scanner.next();

        Car newCar = new Car(licensePlate, color, model);
        carLot.add(newCar);

        System.out.println("Car added successfully!");
    }

    public static void viewAllCars() {
        if (carLot.isEmpty()) {
            System.out.println("No cars in the lot.");
        } else {
            System.out.println("Cars in the lot:");
            for (Car car : carLot) {
                System.out.println(car);
            }
        }
    }

    public static void findCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter License Plate to find:");
        String licensePlate = scanner.next();

        for (Car car : carLot) {
            if (car.getLicensePlate().equals(licensePlate)) {
                System.out.println("Car found:");
                System.out.println(car);
                return;
            }
        }

        System.out.println("Car not found with the given License Plate.");
    }
}
