
import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "Stack:" + list.toString();
	}

	public static void main(String[] args) {
		Stack list = new Stack();
		list.push(3);
		list.push(4);
		// The toString() method defined in the Object class is overridden to display
		// the contents of the stack by invoking list.toString().
		// The toString() method implemented in ArrayList returns a string
		// representation of all the elements in an array list.
		System.out.println(list.toString());

	}

}
