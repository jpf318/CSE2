//Juan Pablo Ferrer
//September 24, 2014
//CSE2 Sec 111
//Lab05 - RandomGames
//This program allows the user to determine the semester and year
//he/she has taken by just inserting a series of values.
//The progrma will ask for the user's input and will display
//the semester and year the user took that course
//Similar to what universities use to manage courses
import java.util.Scanner;
public class RandomGames{
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in); //Begin by importing and naming your scanner

        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
            //boolean invalidInput = false;
            String random="";
            boolean input = myScanner.next();
            int Roulette = (int)(Math.random()*36);
            switch (input) {
                case 'R': case 'r':random = Roulette;
                    break;
                case 'C': case 'c':random = "";
                    break;
                case 'P': case 'p':random = "";
                    //if random == 36 (
                    //random == "00");
                    break;
                default:invalidInput=true;
                    break;
            }
            if (invalidInput);
                System.out.println("'"+input+"' is not one of 'R','r','C','c','P', or 'p'");
    }
}
