package main;

public class LeapYear {

	public static boolean isLeapYear(int i) {

		if(i == 0) return false;
		if(i % 4 == 0) {
			if(i % 100 == 0) {
				if(i % 400 == 0) {
					return true;
				} else return false;
			} else return true;
		} else {
			return false;
		}
	}
 
}
