package Instructions;

import Computer.*;

public class Add implements Instruction {

    private Operand o1;
    private Operand o2;
    private Address address;

    public Add(Operand o1, Operand o2, Address address) {
        this.o1 = o1;
        this.o2 = o2;
        this.address = address;
    }

    public void execute(Memory memory, Program program, Counter counter) {
        Word word1 = o1.getWord(memory);
        Word word2 = o2.getWord(memory);

        address.setValue(word1.add(word2), memory); // Cas

        counter.setValue(counter.getValue() + 1);
    }

    public String toString() {
        return "ADD " + address.toString() + " " + o2.toString() + " " + o1.toString();
    }
}
