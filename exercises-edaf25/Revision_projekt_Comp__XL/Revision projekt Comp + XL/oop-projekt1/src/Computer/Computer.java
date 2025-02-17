package Computer;

import Instructions.Instruction;

public class Computer {
    Memory memory;
    Program program;
    Counter counter;

    public Computer(Memory memory) {
        this.memory = memory;
    }

    /**
     * Load a program into the computer
     * 
     * @param program the program to load
     */
    public void load(Program program) {
        this.program = program;
    }

    /**
     * Run the loaded program
     */
    public void run() {
        counter = new Counter(0);
        while (counter.getValue() < program.size()) {
            Instruction instruction = program.get(counter.getValue());
            instruction.execute(memory, program, counter);
        }
    }
}
