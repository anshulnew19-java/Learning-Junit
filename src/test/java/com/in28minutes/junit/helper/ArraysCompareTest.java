package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {15,3,9,10};
		int[] expected = {3,9,10,15};
		Arrays.parallelSort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.parallelSort(numbers);
	}
	
	@Test(timeout = 1000)
	public void test_Array_Performance() {
		int[] array = {12,23,4};
		for (int i = 1; i <= 100000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
