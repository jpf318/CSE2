//Juan Pablo Ferrer
//September 16, 2014
//CES2 Sec 111
//hw03 - Root
//This program will allow the user to input any double, and the
//program will find the cube root of the double inputed

import java.util.Scanner; //First got to import the scanner to avoid compiling errors
public class Root {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print(
            "Enter a double, and I'll print its cube root: "); //Asking for user to input double
            double nInitial = myScanner.nextDouble(); //Variable in place with input data
        
        //In order to find the closest cube root, the double will be divided by 3
        //and later, following the general rule "((2*guess*guess*guess)+initial value)/(3*guess*guess)"
        //in order to approximate our root to it's original one (precision)
        double initialGuess = nInitial/3;
        double guess1 = ((2*initialGuess*initialGuess*initialGuess)+nInitial)/(3*initialGuess*initialGuess);
        double guess2 = ((2*guess1*guess1*guess1)+nInitial)/(3*guess1*guess1);
        double guess3 = ((2*guess2*guess2*guess2)+nInitial)/(3*guess2*guess2);
        double guess4 = ((2*guess3*guess3*guess3)+nInitial)/(3*guess3*guess3);
        double guess5 = ((2*guess4*guess4*guess4)+nInitial)/(3*guess4*guess4);
        //Since we want more precision, the same process will be done several time
        //In order to eliminate clusters / paragraphs of code, a loop can be used to simplify
        
        double check = guess5*guess5*guess5;
        //In order to check if our root is close to the original one
        
        System.out.println(
            "The cube root is: "+guess5);
        System.out.println(
            "Checking - ("+guess5+"^3) = "+check);
    }
}