package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.LeapYear;

public class LeapYearTest {

	@Test
	public void testLeaveYear() {
		assertEquals(true, LeapYear.isLeapYear(2400));
	}

	@Test
	public void testLeaveYearNot() {
		assertEquals(false, LeapYear.isLeapYear(1900));
	}
	
	@Test
	public void testLeaveYearZero() {
		assertEquals(false, LeapYear.isLeapYear(0));
	}
}
