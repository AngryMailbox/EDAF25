package command;

public class TV implements Device {
    @Override
    public void on() {
        System.out.println("ON!");

    }

    @Override
    public void off() {
        System.out.println("OFF!");

    }
}
