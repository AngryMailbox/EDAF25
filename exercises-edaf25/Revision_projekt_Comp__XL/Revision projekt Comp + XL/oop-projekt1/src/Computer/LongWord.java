package Computer;

public class LongWord implements Word {
    private long value;

    public LongWord(long value) {
        this.value = value;
    }

    @Override
    public void setValue(Word value) {
        // check if value is a LongWord
        // if (!(value instanceof LongWord)) {
        // throw new IllegalArgumentException("LongWord expected");
        // }
        this.value = ((LongWord) value).getValue();
    }

    @Override
    public long getValue() {
        return this.value;
    }

    @Override
    public Word add(Word other) {
        // check if other is a LongWord
        // if (!(other instanceof LongWord)) {
        // throw new IllegalArgumentException("LongWord expected");
        // }
        return new LongWord(this.value + other.getValue());
    }

    @Override
    public Word mul(Word other) {
        return new LongWord(this.value * other.getValue());
    }

    @Override
    public Word sub(Word other) {
        return new LongWord(this.value - other.getValue());

    }

    @Override
    public Word copy() {
        return new LongWord(this.value);
    }

    @Override
    public boolean equals(Word other) {
        return this.value == ((LongWord) other).getValue();
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public Word getWord(Memory memory) {
        return this;
    }
}
