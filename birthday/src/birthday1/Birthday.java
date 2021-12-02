/*John Carlo Cabanilla
 * Java 142
 * Syeda Nizami
 * Birthday Test
 * */

package birthday1;
import java.util.*;

public class Birthday{
	public static void main(String [] args ){
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("What month, day, and year were you born?  ");
		
		
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();
	
		
		TeacherDate date = new TeacherDate(year, month, day);
		TeacherDate today = new TeacherDate();
	
		
		System.out.println("You were born on " + date.toString() + ", which was a " + date.getDayOfWeek() + ".");
		
		if (date.getDay() == today.getDay() && date.getMonth() == today.getMonth()){
			System.out.println("Happy Birthday! You are now age " + getAge(date, today));
		}
	
		else if (date.isLeapYear()){
			System.out.println(date.getYear() + " was a leap year.");
		}
	  
		
		if (dayCounter(date, today) != 365){
			System.out.println("It will be your birthday in " + daysUntilBirthday(date, today) + " days.");
		}
	
		System.out.println("You are " + dayCounter(date, today) + " days old.");
		
	}
	
	
	public static int getAge( TeacherDate date, TeacherDate today ){
		return (today.getYear() - date.getYear());
	}
	
	public static int dayCounter(TeacherDate date, TeacherDate today){
		double daysOld = 0;
		TeacherDate dayCounter = new TeacherDate(date.getYear(), date.getMonth(), date.getDay());
		
		while (dayCounter.equals(today) == false) {	
			++daysOld;
			dayCounter.nextDay();		
		}
		
		return (int) daysOld;
	}
	public static int daysUntilBirthday(TeacherDate date, TeacherDate today){
		
		TeacherDate birthday = new TeacherDate(today.getYear(), date.getMonth(), date.getDay()); 
		
		TeacherDate birthdayAfter = new TeacherDate((today.getYear() + 1), date.getMonth(), date.getDay());
		
		if( birthday.getMonth() <= today.getMonth() && birthday.getDay() < today.getDay()){
			return dayCounter(birthday, today);
		}
		else if (birthday.getMonth() > today.getMonth()){
			return dayCounter(today, birthday);
		}
		else{	
			return dayCounter(today, birthdayAfter);
		}
		
	}
}