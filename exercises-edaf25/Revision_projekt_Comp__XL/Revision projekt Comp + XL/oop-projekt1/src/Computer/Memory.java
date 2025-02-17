package Computer;

public interface Memory {
	/**
	 * Get the word at the given address
	 * 
	 * @param address the address to get the word from
	 * @return the word at the given address
	 */
	public Word get(int address);

	/**
	 * Set the word at the given address
	 * 
	 * @param address the address to set the word at
	 * @param word    the word to set
	 */
	public void set(int address, Word word);

	/**
	 * Get the size of the memory
	 * 
	 * @return the size of the memory
	 */
	public int size();
}