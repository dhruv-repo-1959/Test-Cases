package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.LeapYear;

public class LeapYearTest {

	@Test
	public void test2000LeaveYear() {
		assertEquals(true, LeapYear.isLeapYear(2000));
	}
	
	@Test
	public void test1900LeaveYearNot() {
		assertEquals(false, LeapYear.isLeapYear(1900));
	}
	
	@Test
	public void test2100LeaveYearNot() {
		assertEquals(false, LeapYear.isLeapYear(2100));
	}
	
	@Test
	public void test2008LeaveYear() {
		assertEquals(true, LeapYear.isLeapYear(2008));
	}

	@Test
	public void test2019LeaveYearNot() {
		assertEquals(false, LeapYear.isLeapYear(2019));
	}
	
	@Test
	public void testLeaveYearZero() {
		assertEquals(false, LeapYear.isLeapYear(0));
	}
}
