
/**
 * Program Name: timeConversion
 * Name: kate chae
 * Date: March 8th
 */
import java.util.*;
public class timeConversion

{
       public static void main(String[] args)
       {     
		int theMinutes;
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the time in minutes: ");
        theMinutes = input.nextInt();
        int theHours = theMinutes/60;
        int theMinutos= theMinutes%60;
        System.out.println("The time is " + theHours + ":" + theMinutos);
    }
}
