public class TestStackOfIntegers {
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();
		for (int i = 0; i < 20; i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}
}

class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	// Construct a stack with the default capacity 16
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	// Construct a stack with the specified maximum capacity
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	/**
	 * Push a new integer to the top of the stack. If the stack is full 
	 * (i.e., size>= capacity), create a new array of twice the current capacity, copy the
	 * contents of the current array to the new array, and assign the reference of
	 * the new array to the current array in the stack.
	 */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			for (int i = 0; i < elements.length; i++) {
				temp[i] = elements[i];
			}
			elements = temp;
		}
		elements[size] = value;
		size = size + 1;
	}

	// Return and remove the top element from the stack
	public int pop() {
		size = size - 1;
		int element = elements[size];
		return element;

	}

	// Return the top element from the stack */
	public int peek() {
		return elements[size - 1];

	}

	// Test whether the stack is empty
	public boolean isEmpty() {
		return size == 0;

	}

	// Return the number of elements in the stack
	public int getSize() {
		return size;

	}

}
