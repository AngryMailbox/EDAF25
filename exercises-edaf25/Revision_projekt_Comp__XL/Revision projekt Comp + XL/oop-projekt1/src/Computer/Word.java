package Computer;

public interface Word extends Operand {

    public void setValue(Word value);

    /**
     * Get the value of the word
     */
    public long getValue();

    /**
     * Add the word to another word
     */
    public Word add(Word other);

    public Word mul(Word other);

    public Word sub(Word other);

    public Word copy();

    public boolean equals(Word other);
}
