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
        int awnumerouno;
        int awnumerodos;
        int awnumerotres;
        int martnumerouno;
        int martnumerodos;
        int martnumerotres;
        Scanner input = new Scanner(System.in);
        System.out.print("Awbrey New York Votes: ");
        awnumerouno = input.nextInt();
        System.out.print("Awbrey New Jersey votes: ");
        awnumerodos = input.nextInt();
        System.out.print("Awbrey Connecticut votes: ");
        awnumerotres = input.nextInt();
        System.out.print("Martinez New York votes: ");
        martnumerouno = input.nextInt();
        System.out.print("Martinez New Jersey: ");
        martnumerodos = input.nextInt();
        System.out.print("Martinez Connecticut: ");
        martnumerotres = input.nextInt();

        double wazahh;
        wazahh = awnumerouno + awnumerodos + awnumerotres + martnumerouno + martnumerodos + martnumerotres;
        double saidByDonPollo;
        saidByDonPollo = awnumerouno + awnumerodos + awnumerotres + martnumerouno + martnumerodos + martnumerotres;
        double iGiveUp;
        iGiveUp = awnumerouno + awnumerodos + awnumerotres/(awnumerouno + awnumerodos + awnumerotres + martnumerouno + martnumerodos + martnumerotres) * 100;
        double saidByme;
        saidByme =  martnumerouno + martnumerodos + martnumerotres/(awnumerouno + awnumerodos + awnumerotres + martnumerouno + martnumerodos + martnumerotres * 100);
        double total;
        total = awnumerouno + awnumerodos + awnumerotres + martnumerouno + martnumerodos + martnumerotres;
    
        System.out.println("Canidate\t\t\tVotes\tPercentage\nAwbrey\t\t\t\t" + wazahh + "\t" + iGiveUp +"%\nMartinez\t\t\t" + saidByDonPollo + "\t" + saidByme + "%\nTOTAL VOTES: " + total); 
    
    }
}