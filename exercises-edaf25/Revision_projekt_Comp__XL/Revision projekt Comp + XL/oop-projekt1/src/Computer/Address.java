package Computer;

public class Address implements Operand {
    int value;

    /**
     * Constructor for the address
     * 
     * @param value the value of the address
     */
    public Address(int value) {
        this.value = value;
    }

    /**
     * Get the value of the address
     * 
     * @return the value of the address
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the value of the address
     * 
     * @param value the value of the address
     */
    public void setValue(Word value, Memory memory) {
        memory.set(this.value, value);
    }

    public String toString() {
        return "[" + value + "]";
    }

    /**
     * Get the word at this address from the memory
     * 
     * @param memory the memory to get the word from
     * @return the word at this address from the memory
     */
    @Override
    public Word getWord(Memory memory) {
        return memory.get(value);
    }

}
