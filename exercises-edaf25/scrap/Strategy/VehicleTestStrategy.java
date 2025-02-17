package scrap.Strategy;

interface drivingStrategy {
    public void drive();
}

interface stoppingStrategy {
    public void stop();
}

class truckStop implements stoppingStrategy {
    public void stop() {
        System.out.println("Truck stop!");
    }
}

class carStop implements stoppingStrategy {
    public void stop() {
        System.out.println("CarStop");
    }
}

class truckDrive implements drivingStrategy {
    public void drive() {
        System.out.println("TruckDrive!");
    }
}

class carDrive implements drivingStrategy {
    public void drive() {
        System.out.println("CarDrive");
    }
}

abstract class Vehicle {
    boolean status;
    drivingStrategy ds;
    stoppingStrategy ss;

    Vehicle(drivingStrategy ds, stoppingStrategy ss) {
        status = false;
        this.ds = ds;
        this.ss = ss;
    }

    abstract void drive();

    abstract void stop();

    void test() {
        start();
        if (status) {
            drive();
            stop();
        }
    }

    private void start() {
        status = true;
    }
}

class Car extends Vehicle {

    Car(drivingStrategy ds, stoppingStrategy ss) {
        super(ds, ss);
    }

    public void drive() {
        ds.drive();
    }

    public void stop() {
        ss.stop();
    }
}

class Truck extends Vehicle {

    Truck(drivingStrategy ds, stoppingStrategy ss) {
        super(ds, ss);
    }

    public void drive() {
        ds.drive();
    }

    public void stop() {
        ss.stop();
    }

}

public class VehicleTestStrategy {
    public static void main(String args[]) {
        Vehicle car = new Car(new carDrive(), new carStop());
        testVehicle(car);
        Vehicle truck = new Truck(new truckDrive(), new truckStop());
        testVehicle(truck);
    }

    static void testVehicle(Vehicle v) {
        v.test();
    }
}