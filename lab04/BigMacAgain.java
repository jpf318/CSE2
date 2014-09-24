//Juan Pablo Ferrer
//September 17, 2014
//CSE2 Sec 111
//Lab04 - BigMacAgain
//
import java.util.Scanner;
public class BigMacAgain{
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        final double bigMacs$ = 2.22;
        final double frenchFries$ = 2.15;
        
        System.out.print(
            "Enter the number of Big Macs: ");
        if( myScanner.hasNextInt() => 0 ) {
        int nBigMacs = myScanner.nextInt();
        int totalBM$ = (int) ((bigMacs$*nBigMacs*100)/100.0); //CHECK THIS LINE
            System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+" x "+bigMacs$+" = $"+totalBM$);
        } else {
            System.out.println ("You did not enter an int");
            return;
        }
        
        System.out.print(
            "Do you want an order of fries (Y/y/N/n)? ");
        if( myScanner.hasNextChar() ) {
            char frenchFries = myScanner.nextChar();
            System.out.println("You ordered fries at a cost of "+)
        } else {
            System.out.println ("You did not enter on of 'y', 'Y', 'N', 'n'")
            return;
        }
        System.out.println()
    }
}