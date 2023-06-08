package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.InterviewTasks;

class InterviewTasksTest {

	@Test
	void getMaxWithNegativeTest() {
		short[] array = { 1, 1, 1, -1, 20, 100, 200, 100, -100, -20, -40, 80 };
		short[] array1 = { -40, 1, -40, -6, 2, 3, 40 };
		short[] array2 = { 40, 1, 2, 3, 40, -30 };
		assertEquals(100, InterviewTasks.getMaxWithNegativePresentation(array));
		assertEquals(40, InterviewTasks.getMaxWithNegativePresentation(array1));
		assertEquals(-1, InterviewTasks.getMaxWithNegativePresentation(array2));
	}

	@Test
	void sortTest() {
		short[] array = new short[100000];

		for (int i = 0; i < array.length; i++) {
			array[i] = (short) (Math.random() * Short.MAX_VALUE);
		}

		InterviewTasks.sort(array);
		testSorted(array);

	}

	private void testSorted(short[] array) {
		for (int i = 1; i < array.length; i++) {
			assertTrue(array[i - 1] <= array[i]);
		}

	}
}
