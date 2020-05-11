package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.LeapYear;

public class LeapYearTest {

	@Test
	public void test2000LeapYear() {
		assertEquals(true, LeapYear.isLeapYear(2000));
	}
	
	@Test
	public void test1900LeapYearNot() {
		assertEquals(false, LeapYear.isLeapYear(1900));
	}
	
	@Test
	public void test2100LeapYearNot() {
		assertEquals(false, LeapYear.isLeapYear(2100));
	}
	
	@Test
	public void test2008LeapYear() {
		assertEquals(true, LeapYear.isLeapYear(2008));
	}

	@Test
	public void test2019LeapYearNot() {
		assertEquals(false, LeapYear.isLeapYear(2019));
	}
	
	@Test
	public void testLeapYearZero() {
		assertEquals(false, LeapYear.isLeapYear(0));
	}
	
	@Test
	public void test19000LeapYearNot() {
		assertEquals(false, LeapYear.isLeapYear(19000));
	}
	
	@Test
	public void test123LeapYearNot() {
		assertEquals(false, LeapYear.isLeapYear(123));
	}
	
	@Test
	public void test12LeapYearNot() {
		assertEquals(false, LeapYear.isLeapYear(12));
	}
}
