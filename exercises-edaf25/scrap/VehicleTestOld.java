package scrap;

class Car {
    private boolean status;

    public Car() {
        this.status = false;
    }

    public void start() {
        this.status = true;
    }

    public void drive() {
        System.out.println("I’m driving a car!");
    }

    public void stop() {
        this.status = false;
        System.out.println("Car stopped");
    }

    public void test() {
        // start();
        if (this.status) {
            drive();
            stop();
        }
    }
}

class Truck {
    private boolean status;

    public Truck() {
        this.status = false;
    }

    public void start() {
        this.status = true;
    }

    public void drive() {
        System.out.println("I’m driving a truck!");
    }

    public void stop() {
        this.status = false;
        System.out.println("Truck stopped");
    }

    public void test() {
        start();
        if (this.status) {
            drive();
            stop();
        }
    }
}

public class VehicleTestOld {
    public static void main(String args[]) {
        Car car = new Car();
        testCar(car);
        Truck truck = new Truck();
        testTruck(truck);
    }

    static void testCar(Car car) {
        car.test();
    }

    static void testTruck(Truck truck) {
        truck.test();
    }
}