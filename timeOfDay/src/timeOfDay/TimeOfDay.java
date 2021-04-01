package timeOfDay;

import java.util.Arrays;

/**
 * Each instance of this class represents a time of day with one minute granularity.
 * 
 * @immutable
 * 
 * The abstract state invariants of this class:
 * 
 * @invar The amount of hours lies between 0 and 23.
 * 		| 0 <= getHours() &&  getHours() <= 23
 * @invar The amount of minutes lies between 0 and 59.
 * 		| 0 <= getMinutes() &&  getMinutes() <= 59
 *
 */

public class TimeOfDay {

	// getters or inspector methods
	
	/**
	 * @basic
	 */
	
	public int getHours() {throw new RuntimeException("Not yet implemented."); }
	
	/**
	 * @basic
	 */
	
	public int getMinutes() {throw new RuntimeException("Not yet implemented."); }
	
	/**
	 * This is a derived getter.
	 * 
	 * @post The result equals the hours times 60 plus the minutes.
	 * 		| result == 60*getHours() + getMinutes()
	 */
	
	public int getMinutesSinceMidnight() {throw new RuntimeException("Not yet implemented."); }
	
	/**
	 * 
	 * @post The result is not null.
	 * 		| getTime() != null
	 * @post The time is equal to the array containing the hours and minutes.
	 * 		| Arrays.equals(getTime(), new int[] {getHours(), getMinutes()})
	 * 
	 */
	
	public int[] getTime() {throw new RuntimeException("Not yet implemented."); }
	
	// the constructor
	
	/**
	 * Initializes this object so it represents the time of day specified by the given hours and minutes.
	 * 
	 * 
	 * @throws new RuntimeException when the time of day has more than 23 or negative hours.
	 * 		| hours < 0 || 23 < hours
	 * @throws new RuntimeException when the time of day has more than 59 or negative minutes.
	 * 		| minutes < 0 || 59 < minutes
	 * 
	 * @post The hours of this time of day equals the given hours.
	 * 		| getHours() == hours
	 * @post The minutes of this time of day equals the given minutes.
	 * 		| getMinutes() == minutes
	 * 
	 */
	
	
	public TimeOfDay(int hours, int minutes) {
		if(hours < 0) {
			throw new RuntimeException("The amount of hours is negative.");
		}
		if(23 < hours) {
			throw new RuntimeException("The amount of hours is more than 23.");
		}
		if(minutes < 0) {
			throw new RuntimeException("The amount of minutes is negative.");
		}
		if(59 < minutes) {
			throw new RuntimeException("The amount of minutes is more than 59.");
		}
	}
}
