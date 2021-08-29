public class TestQueueOfIntegers {

	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);
		}

		while (!queue.isEmpty()) {
			System.out.print(queue.dequeue() + " ");
		}
	}
}

class Queue {
	private int[] elements;
	private int size;

	// Construct a queue with the default capacity 8
	public Queue() {
		elements = new int[8];
	}

	// Add a new integer into the queue
	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			for (int i = 0; i < elements.length; i++) {
				temp[i] = elements[i];
			}
			elements = temp;
		}
		elements[size] = v;
		size = size + 1;
	}

	// Remove and return an element from the queue
	public int dequeue() {
		int e = elements[0];
		// Shifts all elements to left
		for (int i = 0; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size = size - 1;
		return e;
	}

	// Test whether the queue is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Return the number of elements in the queue
	public int getSize() {
		return size;
	}
}
