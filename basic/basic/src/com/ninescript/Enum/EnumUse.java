
package com.ninescript.Enum;

/**
 * 
 * @author Piyush
 * Use Of Enum
 *
 */


public class EnumUse {
	public enum Day
	{
		MONDAY,
		TUESDAY,
		WEDENSDAY,
		THUESDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
	}

	Day day;
	EnumUse(Day day)
	{
		this.day=day;
	}
	
	void testingEnum()
	{
		switch(day)
		{
		case MONDAY:
						System.out.println("BUSY DAY");
						break;
		case TUESDAY:
						System.out.println("NEXT DAY");
						break;
		case FRIDAY:
						System.out.println("FRIDAY IS COOL DAY");
						break;
		case SATURDAY:
						System.out.println("SATURDAY IS LAST DAY OF WEEK");
						break;
		}
	}
	public static void main(String[] args) {
		EnumUse e=new EnumUse(Day.MONDAY);
		e.testingEnum();
	}
}
