//Juan Pablo Ferrer
//September 17, 2014
//CSE2 Sec 111
//Lab04 - BigMacAgain
//
import java.util.*;
public class BigMacAgain {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the number of Big Macs: ");
        if (myScanner.hasNextInt()) {
            int nBigMacs = myScanner.nextInt();
            if(nBigMacs > 0) {
                double bigMacCost = nBigMacs*2.22;
                System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"x2.22 = $"+bigMacCost);
                System.out.print("Do you want an order of fries (Y/y/N/n): ");
                char dFries = myScanner.next().charAt(0);
                String sResult = "The total cost of the meal is $";
                double total = bigMacCost + 2.15;
                    if (dFries == 'y' || dFries == 'Y') {
                        System.out.println("You ordered fries at a cost of $2.15");
                        System.out.println(sResult+total);
                    } else if (dFries == 'n' || dFries == 'N') {
                        System.out.println(sResult+bigMacCost);
                    } else {
                        System.out.println ("You did not enter one of 'y', 'Y', 'N', 'n'");
                    }
            } else {
                System.out.println("You did not enter an int > 0");
            }
        } else {
            System.out.println("You didn't enter an int");
        }
    }
}
