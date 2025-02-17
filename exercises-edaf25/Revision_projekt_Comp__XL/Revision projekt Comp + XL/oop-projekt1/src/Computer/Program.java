package Computer;

import Instructions.Instruction;

public interface Program {

    void add(Instruction instruction);

    int size();

    Instruction get(int value);

    String toString();
}
