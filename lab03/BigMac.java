//Juan Pablo Ferrer
//September 10, 2014
//Lab03 - BigMac
//This program will compute the cost of buying some Big Macs
//It will allow the user to input information and it will print
//out the computations
import java.util.Scanner;
public class BigMac {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        int nBigMacs = myScanner.netInt();
        
        System.out.print("enter the cost per Big Mac as" + "a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percentage tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;
        
        double cost$;
        int dollars;
        int dimes;
        int pennies;
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        int dollars=(int)cost$;
        dimes=(int)(cost*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println ("The total cost of "+nBigMacs+" BigMacs, at $"
                            +bigMac$+" per bigMac, with a "+" sales tax of "
                            +(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
                            
        
        
        
    }
}