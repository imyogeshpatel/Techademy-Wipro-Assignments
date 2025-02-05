abstract class Vehicle {
    abstract void startEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with a key ignition.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started with a self-start button.");
    }
}

public class VehicleTest {
    static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        
        vehicleTestDrive(myCar);
        vehicleTestDrive(myMotorcycle);
    }
}