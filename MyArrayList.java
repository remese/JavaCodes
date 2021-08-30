
public class MyArrayList {
	private int[] list;
	private int size;
	public static final int INITIAL_CAPACITY = 4;

	// Construct a list with the default capacity 4
	public MyArrayList() {
		this(INITIAL_CAPACITY);
	}

	// Construct a list with the specified maximum capacity
	public MyArrayList(int capacity) {
		list = new int[capacity];
	}

	/**
	 * If the list is full (i.e., size>= capacity), create a new array of twice the
	 * current capacity, copy the contents of the current array to the new array,
	 * and assign the reference of the new array to the current array in the list.
	 */
	private void ensureCapacity() {
		if (size >= list.length) {
			int[] temp = new int[list.length * 2];
			for (int i = 0; i < list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
	}

	public boolean isFull() {
		return size >= list.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void addFirst(int e) {
		if (size == 0) {
			list[0] = e;
		} else {
			if (isFull()) {
				ensureCapacity();
			}
			// Move the elements of the array one position to the right
			for (int i = size - 1; i >= 0; i--) {
				list[i + 1] = list[i];
			}
			list[0] = e;
		}
		size = size + 1;
	}

	public void addLast(int e) {
		if (isFull()) {
			ensureCapacity();
		}
		list[size] = e;
		size = size + 1;
	}

	public void addInOrder(int e) {
		if (size == 0) {
			addFirst(e); // Insert first
		} else {
			int i = 0;
			while (size > i && e > list[i]) {
				i = i + 1;
			}
			System.out.println("i=" + i);
			add(i, e);
		}

	}

	public void add(int index, int e) {
		if (isFull()) {
			ensureCapacity();
		}
		// Move the elements to the right after the specified index
		for (int i = size - 1; i >= index; i--)
			list[i + 1] = list[i];
		// Insert new element to list[index]
		list[index] = e;
		size = size + 1;
	}

	public int remove(int index) {
		int e = list[index];
		// Shift data to the left
		for (int j = index; j < size - 1; j++) {
			list[j] = list[j + 1];
		}
		list[size - 1] = 0; // This element is now zero
		// Decrement size
		size = size - 1;
		return e;
	}

	public void displayList() {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
