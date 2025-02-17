package Instructions;

import Computer.*;

public class Halt implements Instruction {

    public Halt() {
    }

    public void execute(Memory memory, Program program, Counter counter) { // TODO: Detta ska stanna programmet!
        System.exit(0);
    }

    public String toString() {
        return "HLT";
    }
}
