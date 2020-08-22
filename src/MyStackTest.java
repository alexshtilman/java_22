import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackTest {
	MyStack listInt;

	@BeforeEach
	void setup() {
		listInt = new MyStack();
	}

	@Test
	void testPush() {
		int expected[] = { 0, 1, 2, 3, 8, 5, 6, 7, -3 };
		for (int i : expected) {
			listInt.push(i);
		}
		assertEquals(8, listInt.getMax());
	}

	@Test
	void testPop() {
		int expected[] = { 3, 7, 6, 3, 8, 3, 9, 0 };
		for (int i : expected) {
			listInt.push(i);
		}
		assertEquals(0, listInt.pop());
	}

	@Test
	void testIsEmpty() {
		assertTrue(listInt.isEmpty());
		try {
			listInt.pop();
		} catch (NoSuchElementException e) {
			System.out.println("Expected exception");
		}
		int expected[] = { 3, 7, 6, 3, 8, 3, 9, 0 };
		for (int i : expected) {
			listInt.push(i);
		}
		assertFalse(listInt.isEmpty());
	}

	@Test
	void testGetMax() {
		int expected[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i : expected) {
			listInt.push(i);
		}
		assertEquals(8, listInt.getMax());
		listInt.clear();
		int expected2[] = { 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		for (int i : expected2) {
			listInt.push(i);
		}
		assertEquals(8, listInt.getMax());
		listInt.clear();
		int expected3[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		for (int i : expected3) {
			listInt.push(i);
		}
		assertEquals(1, listInt.getMax());
		listInt.clear();
		int expected4[] = { 3, 7, 6, 3, 8, 3, 9, 0 };
		for (int i : expected4) {
			listInt.push(i);
		}
		assertEquals(9, listInt.getMax());
		listInt.clear();
		int expected5[] = { 1, -2, 6, -4, 8, -3, 9, 0 };
		for (int i : expected5) {
			listInt.push(i);
		}
		assertEquals(9, listInt.getMax());
		listInt.pop();
		listInt.pop();
		assertEquals(8, listInt.getMax());
	}
}
