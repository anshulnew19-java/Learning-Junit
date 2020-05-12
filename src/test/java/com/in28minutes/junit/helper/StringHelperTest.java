package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class-----");
	}
	
	@Before
	public void before() {
		System.out.println("Before****");
		stringHelper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Positions() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition_One() {
		assertEquals("", stringHelper.truncateAInFirst2Positions("AA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Basic_Negative_Scenario() {
		//assertEquals(false,stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Basic_Positive_Scenario() {
		//assertEquals(true,stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Basic_Positive_Scenario_With_One_String() {
		//assertEquals(false,stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Basic_Positive_Scenario_With_Two_String() {
		//assertEquals(true,stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@After
	public void tearDown() {
		System.out.println("After.....");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class------");
	}

}
