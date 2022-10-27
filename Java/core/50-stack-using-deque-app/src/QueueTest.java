import java.util.ArrayDeque;
import java.util.Deque;

public class QueueTest {
	static Deque<Integer> dq = new ArrayDeque<Integer>();

	public static void push(int number) {
		System.out.println("Adding element: " + number);
		dq.addLast(number);
	}

	public static void pop() {
		if (dq.isEmpty()) {
			System.out.println("Removing element: ");
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Removing element: ");
			dq.removeFirst();
		}
	}

	public static void display() {
		System.out.println(dq);
	}

	public static void main(String[] args) {
		push(10);
		push(20);
		display();

		push(30);
		display();

		pop();
		display();

		pop();
		display();
		pop();
		display();
		pop();
	}
}
