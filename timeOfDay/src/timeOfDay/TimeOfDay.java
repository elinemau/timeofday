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
	
	/**
	 * @invar | 0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 * 
	 */
	
	private int hours;
	private int minutes;

	// getters or inspector methods
	
	/**
	 * @basic
	 */
	
	public int getHours() {return hours;}
	
	/**
	 * @basic
	 */
	
	public int getMinutes() {return minutes;}
	
	/**
	 * This is a derived getter.
	 * 
	 * @post The result equals the hours times 60 plus the minutes.
	 * 		| result == 60*getHours() + getMinutes()
	 */
	
	public int getMinutesSinceMidnight() {
		return hours * 60 + minutes;
	}
	
	
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
		if(hours < 0 || 23 < hours) {
			throw new IllegalArgumentException("`hours`is invalid");
		}
		if(minutes < 0 || 59 < minutes) {
			throw new IllegalArgumentException("`minutes` is invalid");
		}
		
		this.hours = hours;
		this.minutes = minutes;
	}
}
