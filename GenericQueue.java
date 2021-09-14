import java.util.LinkedList;

public class GenericQueue<E> {

	private LinkedList<E> list = new LinkedList<>();

	public void enqueue(E e) {
		list.addLast(e);
	}

	public E dequeue() {
		return list.removeFirst();
	}

	public int getSize() {
		return list.size();
	}

	@Override
	public String toString() {
		return "Queue: " + list.toString();
	}

	public static void main(String[] args) {
		GenericQueue<String> queue = new GenericQueue<>();

		// Add elements to the queue
		queue.enqueue("Tom"); // Add it to the queue
		System.out.println(queue.toString());

		queue.enqueue("Susan"); // Add it to the queue
		System.out.println(queue.toString());

		queue.enqueue("Kim"); // Add it to the queue
		queue.enqueue("Michael"); // Add it to the queue
		System.out.println(queue.toString());

		// Remove elements from the queue
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.toString());

	}

}
