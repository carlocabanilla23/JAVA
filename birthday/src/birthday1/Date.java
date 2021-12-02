package birthday1;
import java.util.*;

public class Date{
	private int year = 1970;
	private int month = 1;
	private int day = 1;
	private int dayOfWeekIndex = 3;
	private static final int MONTHS_PER_YEAR = 12;
	private static final int START_DATE = 1970;
	private static final int END_OF_WEEK = 6;
	private static final int BEGINNING_OF_WEEK = 0;
	String [] daysInWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
	
	public Date(int year, int month, int day){
		if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31){
			throw new IllegalArgumentException();
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Date(){
		int dayCount = 0;
		while (dayCount < this.getDaysSinceEpoch()){
			this.nextDay();
			++dayCount;
		}
	}
		
	
	public int getDay(){
		return this.day;
	}
	
	
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}
    public String getDayOfWeek(){
           
            return this.daysInWeek[this.dayOfWeekIndex];
    }

	
	
	public boolean isLeapYear(){
		
		if ((this.year % 4 == 0) && (this.year % 100 != 0) || (this.year % 400 == 0)){
			return true;
		}
		else{
			return false;
		}
	}
	public void nextDay(){
		
		if (this.getDay() < this.daysInMonth() ){
			++this.day;
		}
	
		else if (this.getDay() == this.daysInMonth() && this.getMonth() < MONTHS_PER_YEAR){
			++this.month;
			this.day = 1;
		}
		else if (this.getMonth() == MONTHS_PER_YEAR){
			++this.year;
			this.month = 1;
			this.day = 1;
		}	
		
		if (this.dayOfWeekIndex == END_OF_WEEK){
			this.dayOfWeekIndex = BEGINNING_OF_WEEK;
		}
		++this.dayOfWeekIndex;
	
		
	}
	public String toString(){
		return this.year + "/" + this.month + "/" + this.day;
	}
	public boolean equals (Object o){
		if (o instanceof Date){
			Date compare = (Date) o;
			
			return this.year == compare.year && this.month == compare.month && this.day == compare.day; 
		}
		else { 
			return false;
		}
		
	}
	public int daysInMonth(){
		
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	
		if (this.isLeapYear()){
			months[1] = 29;
		}
		if (this.month == 1){
			return months[0];
		}
		else{
			return months[this.month - 1];
		}
		
	}

	public int getDaysSinceEpoch(){
		return (int) ((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 1000 / 60 / 60 / 24);
	}
}
