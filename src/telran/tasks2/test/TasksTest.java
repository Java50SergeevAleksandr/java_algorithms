package telran.tasks2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.tasks2.Anagram;
import telran.tasks2.ValidBrackets;

class TasksTest {

	@Test
	void anagramTest() {
		String test1 = "abcd";
		assertTrue(Anagram.isAnagram(test1, "abcd"));
		assertTrue(Anagram.isAnagram(test1, "AbCd"));
		assertTrue(Anagram.isAnagram(test1, "DbaC"));
		assertFalse(Anagram.isAnagram(test1, "abc"));
		assertFalse(Anagram.isAnagram(test1, "abcde"));
		assertFalse(Anagram.isAnagram(test1, "abcz"));
		assertFalse(Anagram.isAnagram(test1, "Aaaa"));
	}
	
	@Test
	void BracketsTest() {
		String test1 = "aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )";
		String test2 = ")dfgswfgsf(";
		String test3 = "[werwert(wertwrtw] wertrt)";
		String test4 = "((((";
		String test5 = "(((()";
		assertTrue(ValidBrackets.hasValidBrackets(test1));
		assertFalse(ValidBrackets.hasValidBrackets(test2));
		assertFalse(ValidBrackets.hasValidBrackets(test3));
		assertFalse(ValidBrackets.hasValidBrackets(test4));
		assertFalse(ValidBrackets.hasValidBrackets(test5));
	}
}
