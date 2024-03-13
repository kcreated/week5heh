
/**
 * Program Name: taxiApplication
 * Name: kate chae
 * Date: March 13th
 */
import java.util.*;
public class taxiApplication

{
       public static void main(String[] args)
       {     
		int passengers;
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of passegers: ");
        passengers = input.nextInt();
        int cabs = passengers/4;
        int leftOver = passengers%4;
        System.out.println(cabs + " cabs are required");
        System.out.println(leftOver + " passengers(s) will be left over");
    }
}
