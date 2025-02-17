package Instructions;

import Computer.*;

public class Print implements Instruction {
    Address address;

    public Print(Address address) {
        this.address = address;
    }

    public void execute(Memory memory, Program program, Counter counter) {
        System.out.print(address.getWord(memory).getValue());
        counter.setValue(counter.getValue() + 1);
    }

    public String toString() {
        return "PRT " + address.toString();
    }
}
