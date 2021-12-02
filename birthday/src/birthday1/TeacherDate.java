package birthday1;


import java.util.*;

public class TeacherDate {
 
 private static final int JANUARY =  1;
 private static final int FEBRUARY =  2;
 private static final int DECEMBER = 12;
 private static final int START_YEAR = 1753;
 private static final int DAYS_PER_WEEK = 7;
 private static final String[] DAY_NAMES = {"Sunday", "Monday", "Tuesday",
     "Wednesday", "Thursday", "Friday", "Saturday"};
 private static final int[] DAYS_PER_MONTH = { -1,
 
     31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
 };

 
 public static int getDaysSinceEpoch() {
     return (int) ((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 1000 / 60 / 60 / 24);
 }

 
 
 private int year;
 private int month;
 private int day;

 
 public TeacherDate(int year, int month, int day) {
     this.year = year;
     this.month = month;
     this.day = day;

     if (year < START_YEAR) {
         throw new IllegalArgumentException(this + " year too small: " + year);
     }
     if (month < JANUARY || month > DECEMBER) {
         throw new IllegalArgumentException(this + " month out of range: " + month);
     }
     if (day < 1 || day > this.getDaysInMonth()) {
         throw new IllegalArgumentException(this + " day out of range: " + day);
     }
 }
 
 
 public TeacherDate() {
     this(1970, JANUARY, 1);
     int daysSinceEpoch = getDaysSinceEpoch();
     for (int i = 0; i < daysSinceEpoch; i++) {
         this.nextDay();
     }
 }
 

 public boolean equals(Object o) {
    
     if (o == null || !(o instanceof TeacherDate)) {
         return false;
     }
     
     TeacherDate other = (TeacherDate) o;
     return this.day == other.day && this.month == other.month &&
            this.year == other.year;
 }
 
 
 public int getDay() {
     return this.day;
 }
 
 
 public int getMonth() {
     return this.month;
 }
 
 
 public int getYear() {
     return this.year;
 }

 
 public String getDayOfWeek() {
     int dayIndex = 1;
     TeacherDate temp = new TeacherDate(START_YEAR, JANUARY, 1);
     while (!temp.equals(this)) {
         temp.nextDay();
         dayIndex = (dayIndex + 1) % DAYS_PER_WEEK;
     }
     
     return DAY_NAMES[dayIndex];
 }
 
 
 public boolean isLeapYear() {
     return (this.year % 400 == 0) || (this.year % 4 == 0 && this.year % 100 != 0);
 }
 
 
 public void nextDay() {
     this.day++;
     if (this.day > this.getDaysInMonth()) {
         
         this.month++;
         this.day = 1;
         if (this.month > DECEMBER) {
         
             this.year++;
             this.month = JANUARY;
         }
     }
 }
 
 
 public String toString() {
     return this.year + "/" + this.month + "/" + this.day;
 }


 private int getDaysInMonth() {
     int result = DAYS_PER_MONTH[this.month];
     if (this.month == FEBRUARY && this.isLeapYear()) {
         result++;
     }
     return result;
 }
}
