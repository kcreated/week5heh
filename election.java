/***********
 * Programmer: Kate Chae
 * Date: March 6th
 * Program Name: election
 *********/

import java.util.*;
public class election

{
    public static void main (String[ ] args)
    {
        int integerfirst;
        int integersecond;
        Scanner input = new Scanner(System.in);
        System.out.print("Awbrey New York Votes: ");
        integerfirst = input.nextInt();
        System.out.print("Awbrey New Jersey votes: ");
        integerfirst = input.nextInt();
        System.out.print("Awbrey Connecticut votes: ");
        integerfirst = input.nextInt();
        System.out.print("Matinez New York votes: ");
        integersecond = input.nextInt();
        System.out.print("Matinez New Jersey: ");
        integersecond = input.nextInt();
        System.out.print("Matinez Connecticut: ");
        integersecond = input.nextInt();

        double divisionone;
        divisionone = integerfirst/integersecond;
        double modulusone;
        modulusone = integerfirst%integersecond;
        double divisiontwo;
        divisiontwo = integersecond/integerfirst;
        double modulustwo;
        modulustwo = integersecond%integerfirst;
        System.out.println(""); 
    
    }
}