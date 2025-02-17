package Main;

import Computer.*;

class Main {

    public static void main(String[] args) {
        Program factorial = new Factorial();
        System.out.println(factorial);
        Computer computer = new Computer(new LongMemory(128));
        computer.load(factorial);
        computer.run();
    }
}
