package Computer;

public class Counter {
    int value;

    public Counter(int value) {
        this.value = value;
    }

    /**
     * Get the value of the counter
     * 
     * @return the value of the counter
     */
    public int getValue() {
        return value;
    }

    /**
     * Increment the counter by 1
     */
    public void increment() {
        this.value++;
    }

    /**
     * Set the counter to the given value
     * 
     * @param lineNumber the value to set the counter to
     */
    public void setValue(int lineNumber) {
        this.value = lineNumber;
    }

    public String toString() {
        return "" + value;
    }
}
