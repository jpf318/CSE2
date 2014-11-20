//Juan Pablo Ferrer
//September 17, 2014
//CSE2 Sec 111
//Lab04 - BigMacAgain
//
import java.util.Scanner;
public class BigMacAgain{
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        int nBigMacs = myScanner.nextInt();
        double bmCost = nBigMacs*2.22;
        System.out.print("Enter the number of Big Macs: ");
        
        if (myScanner.hasNextInt()) {
            if (nBigMacs < 0) {
                System.out.print("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"x2.22 ="+bmCost);
            } else {
                System.out.print("You did not enter an int > 0");
            }
        } else {
            System.out.print("You did not enter an int");
        }
        
        /*System.out.print("Do you want an order of fries (Y/y/N/n)?");
        char fries = (char) myScanner.nextChar();
        
        
        if(fries == 'Y' || fries == 'y') {
            System.out.println("You ordered fries at a cost of $2.15");
            System.out.println("The total cost of the meal is $13.25");
        } else if (fries == 'N' || fries == 'n') {
            System.out.println("The total cost of the meal is $11.1");
        } else {
            System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
        }*/
    }
}