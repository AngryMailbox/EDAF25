package Instructions;

import Computer.*;

public class Mul implements Instruction {
    private Operand op1;
    private Operand op2;
    private Address address;

    public Mul(Operand op1, Operand op2, Address address) {
        this.op1 = op1;
        this.op2 = op2;
        this.address = address;
    }

    public void execute(Memory memory, Program program, Counter counter) { // TODO: Funkar detta ens??
        Word result = op1.getWord(memory).mul(op2.getWord(memory));
        address.setValue(result, memory);
        counter.setValue(counter.getValue() + 1);
    }

    public String toString() {
        return "MUL " + op1.toString() + " " + op2.toString() + " " + address.toString();
    }
}
