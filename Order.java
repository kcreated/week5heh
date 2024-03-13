
/**
 * Program Name: Order
 * Name: kate chae
 * Date: March 13th
 */
import java.util.*;
public class Order
{

       public static void main(String[] args){
            
		int numburger;
		int numfrie;
		int numsoda; 
        int amountTendered; 
        String Thename = " ";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Thename = input.nextLine(); 
        System.out.println("Enter the number of burgers: ");
        numburger = input.nextInt();
        System.out.println("Enter the number of fries: ");
        numfrie = input.nextInt();
        System.out.println("Enter the number of sodas: ");
        numsoda = input.nextInt();

        double beforeTax;
        beforeTax = numburger*1.69 + numfrie*1.09 + numsoda*0.99;
        double theFinal;
        theFinal = (numburger*1.69 + numfrie*1.09 + numsoda*0.99)*1.085;
        double theTax;
        theTax = theFinal - beforeTax; 

        System.out.println("Total before tax: $" + beforeTax);
        System.out.println("Tax: $" + theTax);
        System.out.println("Final Total: $" + theFinal);

        System.out.println("Enter the amount tendered: $");
        amountTendered = input.nextInt();

        double change;
        change = amountTendered - theFinal;
        System.out.println("Change: $" + change);
    }
}

