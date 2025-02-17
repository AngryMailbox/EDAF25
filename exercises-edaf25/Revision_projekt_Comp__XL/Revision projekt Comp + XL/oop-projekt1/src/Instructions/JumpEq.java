package Instructions;

import Computer.*;

public class JumpEq implements Instruction {
    private int lineNumber;
    private Operand op1;
    private Operand op2;

    public JumpEq(int lineNumber, Operand op1, Operand op2) {
        this.lineNumber = lineNumber;
        this.op1 = op1;
        this.op2 = op2;
    }

    public void execute(Memory memory, Program program, Counter counter) {
        Word value1 = op2.getWord(memory);
        Word value2 = op1.getWord(memory);

        if (value1.equals(value2)) {
            counter.setValue(lineNumber);
        } else {
            counter.setValue(counter.getValue() + 1);
        }
    }

    public String toString() {
        return "JEQ " + lineNumber + " " + op1.toString() + " " + op2.toString();
    }

}
