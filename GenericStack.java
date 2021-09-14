import java.util.ArrayList;

public class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<>();

	public int getSize() {
		return list.size();
	}

	public void push(E o) {
		list.add(o);
	}

	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack:" + list.toString();
	}

	public static void main(String[] args) {
		GenericStack<String> stack = new GenericStack<>();
		// Add elements to the stack
		stack.push("Tom"); // Push it to the stack
		System.out.println(stack.toString());

		stack.push("Susan"); // Push it to the the stack
		System.out.println(stack.toString());

		stack.push("Kim"); // Push it to the stack
		stack.push("Michael"); // Push it to the stack
		System.out.println(stack.toString());

		// Remove elements from the stack
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		System.out.println(stack1.toString());
		System.out.println("size = " + stack1.getSize());

		GenericStack<Integer> stack2 = new GenericStack<>();
		stack2.push(1); // autoboxing 1 to new Integer(1) stack2.push(2);
		stack2.push(3);
		System.out.println(stack2.toString());
		System.out.println("size = " + stack2.getSize());

	}
}
