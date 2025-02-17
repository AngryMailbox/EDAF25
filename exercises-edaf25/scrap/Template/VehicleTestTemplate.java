package scrap.Template;

abstract class Vehicle {
    boolean status;

    Vehicle() {
        status = false;
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

    public void drive() {
        System.out.println("I’m driving a car!");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

class Truck extends Vehicle {

    public void drive() {
        System.out.println("I’m driving a truck!");
    }

    public void stop() {
        System.out.println("Truck stopped");
    }

}

public class VehicleTestTemplate {
    public static void main(String args[]) {
        Vehicle car = new Car();
        testVehicle(car);
        Vehicle truck = new Truck();
        testVehicle(truck);
    }

    static void testVehicle(Vehicle v) {
        v.test();
    }
}