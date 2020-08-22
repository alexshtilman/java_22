
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

public class MyStack extends LinkedList {
	private LinkedList<Integer> help = new LinkedList<Integer>();

	public void push(int number) {
		if (help.isEmpty() || number >= help.getLast())
			help.add(number);
		add(number);
	}

	public void clear() {
		super.clear();
		help.clear();
	}

	public Object pop() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		int last = (int) removeLast();
		if (last == help.getLast())
			help.removeLast();
		return last;
	}

	public int getMax() {
		if (isEmpty())
			throw new NoSuchElementException();
		return (int) help.getLast();
	}
}
