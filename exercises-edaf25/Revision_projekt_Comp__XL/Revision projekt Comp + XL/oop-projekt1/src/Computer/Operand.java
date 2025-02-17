package Computer;

public interface Operand {

    /**
     * Get the value of the address
     * 
     * @return the value of the address
     */
    Word getWord(Memory memory); // Memory gissar jag behövs om det är en adress - det ser ni

    String toString();
}