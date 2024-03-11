
/**
 * Program Name: sleepApplication
 * Name: kate chae
 * Date: March 8th
 */
import java.util.*;
public class sleepApplication
{

       public static void main(String[] args){
            
        int useless;
		int birthYear;
		int birthMonth;
		int birthDay; 
		int alsoUseless;
        int currentYear;
		int currentMonth;
		int currentDay; 

		Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate: \n\nYear: ");
        birthYear = input.nextInt();
        System.out.println("Month: ");
        birthMonth = input.nextInt();
        System.out.println("Day: ");
        birthDay = input.nextInt();
        System.out.println("Enter today's date: \n\nYear:");
        currentYear = input.nextInt();
        System.out.println("Month: ");
        currentMonth = input.nextInt();
        System.out.println("Day: ");
        currentDay = input.nextInt();

        int theDays = (currentYear - birthYear)*365 + (currentMonth - birthMonth)*30 + (currentDay - birthDay);
        int theHours = (currentYear - birthYear)*365*8 + (currentMonth - birthMonth)*30*8 + (currentDay - birthDay)*8;
        System.out.println("You have been alive for " + theDays + "days.\nYou have slept for " + theHours + "hours.");
    }
}

