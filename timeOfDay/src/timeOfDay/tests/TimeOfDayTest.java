package timeOfDay.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import timeOfDay.TimeOfDay;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay theTime = new TimeOfDay(15, 44);
		assertEquals(15, theTime.getHours());
		assertEquals(44, theTime.getMinutes());
		assertEquals(944, theTime.getMinutesSinceMidnight());
		assertArrayEquals(new int[] {15, 44}, theTime.getTime());
		
		
	}

}
