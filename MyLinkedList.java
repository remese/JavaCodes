
public class MyLinkedList {
	public Node head, tail;
	public int size;

	public void addFirst(int e) {
		Node newNode = new Node(e); // create a new node
		newNode.next = head; // link the new node with the head
		head = newNode; // head points to the new node
		size = size + 1; // Increase list size

		if (tail == null) { // the new node is the only node in list
			tail = head;
		}
	}

	public void addLast(int e) {
		Node newNode = new Node(e);
		if (tail == null) {
			head = tail = newNode; // The new node is the only node in list
		} else {
			tail.next = newNode; // Link the new with the last node
			tail = tail.next; // tail now points to the last node
		}
		size++; // Increase size
	}


	public void add(int index, int e) {
		if (index == 0) {
			addFirst(e); // Insert first
		} else if (index >= size) {
			addLast(e); // Insert last
		} else { // Insert in the middle
			Node current = head;
			for (int i = 1; i < index; i++) {
				current = current.next;
			}
			Node temp = current.next;
			current.next = new Node(e);
			(current.next).next = temp;
			size++;
		}
	}

	public void addInOrder(int n) {

	}

	public Object removeFirst() {
		if (size == 0)
			return null; // Nothing to delete
		else {
			Node temp = head; // Keep the first node temporarily
			head = head.next; // Move head to point to next node
			size = size - 1; // Reduce size by 1
			if (head == null) {
				tail = null; // List becomes empty
			}
			return temp.element; // Return the deleted element
		}
	}

	public Object removeLast() {
		if (size == 0) { // Nothing to remove
			return null;
		} else if (size == 1) { // Only one element in the list
			Node temp = head;
			head = tail = null;// list becomes empty
			size = 0;
			return temp.element;
		} else {
			Node current = head;
			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}
			Node temp = tail;
			tail = current;
			tail.next = null;
			size = size - 1;
			return temp.element;
		}
	}

	public Object remove(int index) {
		if (index < 0 || index >= size)
			return null; // Out of range
		else if (index == 0)
			return removeFirst(); // Remove first
		else if (index == size - 1)
			return removeLast(); // Remove last
		else {
			Node previous = head;
			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}
			Node current = previous.next;
			previous.next = current.next;
			size = size - 1;
			return current.element;
		}
	}

	public void list() {
		Node current = head;
		while (current != null) {
			System.out.print(current.element + " ");
			current = current.next;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		MyLinkedList list1 = new MyLinkedList();

	}

	private class Node {

		int element;
		Node next;

		public Node() {
		}

		public Node(int element) {
			this.element = element;
		}
	}

}