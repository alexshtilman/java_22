
import java.util.NoSuchElementException;
import java.util.Stack;

public class MyStack {
	private Stack<Integer> arr = new Stack<Integer>();
	private int max = 0;

	public void push(int number) {
		max = number > max ? number : max;
		arr.push(number);
	}

	public void clear() {
		max = 0;
		arr.clear();
	}

	public int pop() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else {
			int last = arr.pop();
			if (isEmpty()) {
				max = 0;

			} else {
				int num = arr.lastElement();
				max = num > max ? num : max;
			}
			return last;
		}

	}

	public boolean isEmpty() {
		return arr.empty();
	}

	public int getMax() {
		if (isEmpty())
			throw new NoSuchElementException();
		return max;
	}
}
