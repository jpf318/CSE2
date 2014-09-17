//Juan Pablo Ferrer
//September 16, 2014
//CES2 Sec 111
//hw03 - FourDigits
//This program will allow me to display the 4 first decimal places of any double
//The program asks the user to input a double, and it will display the 4 first decimal 
//places, as well as place "0"s where there are no values found. 

import java.util.Scanner; //First got to import the scanner to avoid compiling errors
public class FourDigits {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        
        //Set up variables in order to simplify the process
        double userInput = myScanner.nextDouble();          //Value will be inputed by user
        int integer = (int)(userInput);                     //Casting the int, in order to use it later
        int fourdigits = (int)(userInput*10000)%(int)(integer*10000);
        //Process to single out the value found in the 4 first decimal places
        
        System.out.format("The four digits are: %04d%n", fourdigits);
        //"%04d%n" is utilized in order to only display the 4 decimal places of the int
        // and it also point out that if there is no value present in the decimal places,
        // a zero will be placed in it's spot to represent that value.
    }
}