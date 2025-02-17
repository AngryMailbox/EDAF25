package Instructions;

import Computer.*;

public interface Instruction {
    void execute(Memory memory, Program program, Counter counter);

    String toString();
}
