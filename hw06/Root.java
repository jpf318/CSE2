//Juan Pablo Ferrer
//October 14, 2014
//CSE2 Sec 111
//HW06 - Root
/*This program will ask the user to input a positive double
  and the program will calculate the approximate square root
  of the number. While loops and if statements were used in
  this program in order to make it work*/

//Begin by importing the scanner which will allow the user to input data
import java.util.*;
public class Root {
    public static void main(String [] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);

        System.out.print(
            "Enter a double greater than zero (0): "); //Asking the user for his/her input
        
        if(myScanner.hasNextDouble()) {
        //Allow the program to evaluate if the inputed value is indeed a double
            
            double input = myScanner.nextDouble();
            if(input > 0) {
                double high = (1+input); //Highest point in the range
                double low = 0;          //Lowest point in the range
                while ((high-low) > 0.0000001) {
                     double middle = (low + high) / 2;
                     if((middle*middle) > input) {
                         high = middle;
                     } else {
                         low = middle;
                     }
                }
                
            //By nesting an if statement inside a while loop, the if statement will
            //be repeated until the loop doesn't respect it's original statement.
            //Loops are used in order to avoid over clustering and unproductive coding
            
                double sqrRoot = (low + high) / 2;
                System.out.println("Your square root is: "+sqrRoot);
            } else {
                System.out.println("Error: you did not enter a positive input");
            }
        } else {
            System.out.println("Error: you did not enter a double");
            
            //These final else statement are required in order to check if the value
            //inputed is indeed a double, and also as a way of alerting the user
            //that their input isn't valid
        }
    }
}