package Computer;

import Instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProgram implements Program {
    protected List<Instruction> instructions = new ArrayList<>();
    protected List<LongWord> programData = new ArrayList<>();

    /**
     * @param instruction the instruction to add to the program
     */
    @Override
    public void add(Instruction instruction) {
        instructions.add(instruction);
    }

    @Override
    /**
     * @return the number of instructions in the program
     */
    public int size() {
        return instructions.size();
    }

    /**
     * @param value the index of the instruction to return
     * @return the instruction at the given index
     */
    @Override
    public Instruction get(int value) {
        return instructions.get(value);
    }

    /**
     * @return a string representation of the program
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Instruction instruction : instructions) {
            sb.append(i++).append(" ");
            sb.append(instruction.toString()).append("\n");
        }
        return sb.toString();
    }
}
