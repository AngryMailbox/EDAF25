package Instructions;

import Computer.*;

public class Jump implements Instruction {
    int lineNumber;

    public Jump(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void execute(Memory memory, Program program, Counter counter) {
        counter.setValue(lineNumber);
    }

    public String toString() {
        return "JMP " + lineNumber;
    }
}
