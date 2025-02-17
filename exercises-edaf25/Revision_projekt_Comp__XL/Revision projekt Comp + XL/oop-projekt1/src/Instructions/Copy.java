package Instructions;

import Computer.*;

public class Copy implements Instruction {
    private Word word;
    private Address address;

    public Copy(Word word, Address address) {
        this.word = word;
        this.address = address;
    }

    public void execute(Memory memory, Program program, Counter counter) {

        address.getWord(memory).setValue(word);

        // Sätt värdet på adressen till ordets värde
        address.setValue(word.copy(), memory);

        // Öka värdet på programräknaren
        counter.setValue(counter.getValue() + 1);
    }

    public String toString() {
        return "CPY " + word.toString() + " " + address.toString();
    }
}
