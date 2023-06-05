package telran.tasks.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import telran.tasks.LongestSubsequence;
import telran.tasks.NumberConvertor;

class TasksTest {

	@Test
	void NumberConvertorTest() {
		int value = getRandomInt();		
		assertEquals(Integer.toBinaryString(value), NumberConvertor.toBinaryStr(value));
	}
	
	public static int getRandomInt() {
		Random gen = new Random();
		return gen.nextInt(0, 1000000);
	}
	
	@Test
	void LongestSubsequenceTest() {
		int[] src = {1,3,3,2,8,8,8,5,6,6};		
		assertEquals(3, LongestSubsequence.maxSubsequenceLength(src));
		
		int[] src2 = {3,3,3,3,3,3,3,3,3,3};		
		assertEquals(10, LongestSubsequence.maxSubsequenceLength(src2));
		
		int[] src3 = {};		
		assertEquals(0, LongestSubsequence.maxSubsequenceLength(src3));
	}
	  
}
