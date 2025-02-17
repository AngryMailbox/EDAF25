package Computer;

public class LongMemory implements Memory {

	private LongWord[] memory;
	private int size;

	public LongMemory(int size) {
		this.memory = new LongWord[size];
		this.size = size;
		for (int i = 0; i < size; i++) {
			this.memory[i] = new LongWord(0);
		}
	}

	@Override
	/**
	 * Get the word at the given address
	 * 
	 * @param address the address to get the word from
	 * @return the word at the given address
	 */
	public Word get(int address) {
		return this.memory[address];
	}

	@Override
	public void set(int address, Word word) {
		if (!(word instanceof LongWord)) {
			throw new IllegalArgumentException("LongWord expected");
		}
		this.memory[address] = (LongWord) word;
	}

	@Override
	public int size() {
		return size;
	}
}