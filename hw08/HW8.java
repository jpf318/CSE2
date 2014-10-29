//Juan Pablo Ferrer
//October 28, 2014
//CSE2 Sec 111
//HW08 - HW8
/*This program will ask the user to input a wide variety of 
  characters and integers, and the program will try to highlight
  any errors and mistakes the user makes. Rather than the usual program
  this program will allow the user to try again, but sometimes until
  a certain limit. This program mainly focuses on the use and creation of
  methods. */

import java.util.Scanner;
public class HW8 {
    
    //1st Method - Focus on the 'c' and 'C' characters
    public static char getInput(Scanner x, String y) {
        x = new Scanner(System.in); //Activate the scanner
        String input1 = x.next();   //Activate the scanner next input
        char c = input1.charAt(0);  //Split the string, and just focus on one array
        int l = input1.length();    //Sets a limit on the amount of arrays uses
        if ( l > 1 ) {              //Tests the length of the string
            System.out.print("You should enter exactky one character: ");
            c = getInput(x,y);      //Go back to the original method
            return c;              //Return to the beginnig of the method
        }
        
        //Simple if statement which allows the program to evaluate if the user
        //inputted an accepted char
        
        if (c == 'C' || c == 'c') {
            return c;
            } else {
                System.out.print("You did not enter a character from the list 'Cc'; try again: ");
                c = getInput(x,y);
                return c;
            }
    }
    
    public static char getInput(Scanner x, String y, int stop) {
        x = new Scanner(System.in); //Activate the scanner
        String input1 = x.next();   //Activate the scanner next input
        char c = input1.charAt(0);  //Split the string, and just focus on one array
        int l = input1.length();    //Sets a limit on the amount of arrays uses
        
        while(stop > 0) { //This while loop continues until reaching the limit
            stop --; //Decrease the value assigned by the programmer until 0
            if ( l > 1 ) {
                System.out.print("You should enter exactky one character: ");
                c = getInput(x,y,stop);
                return c;
            }
            //Used in order to evaluate if the inputed character is in our range
            if (c == 'y' || c == 'Y' || c == 'n' || c == 'N') {
                return c;
            } else {
                System.out.print("You did not enter a character from the list 'YyNn'; try again: ");
                c = getInput(x,y,stop);
                return c;
            }
        }
        //This process will follow up immediately after exiting the while loop 
        System.out.print("Failed after 5 tries") ; 
        return ' ';
    }
    
    public static char getInput(Scanner x, String command, String y) {
        System.out.print(command);   //Activate the scanner
        x = new Scanner(System.in);  //The command is prompted to the user
        String input1 = x.next();    //Activate the scanner next input
        char c = input1.charAt(0);   //Split the string, and just focus on one array
        int l = input1.length();     //Sets a limit on the amount of arrays uses
        if ( l > 1 ) {
            System.out.println("Enter exactly one character: ");
            c = getInput(x,command,y);
            return c;
        }
        
        String response;
        //Switch cases must be used in order to represent all the possible values
        switch(c) {
            case '0' : //Rather than writing every single case
            case '1' : //by just placing the case at the end
            case '2' : //in this case '9', the program will
            case '3' : //follow that case throughout all of the
            case '4' : // lower cases (0-8). The default acts as
            case '5' : // our error prompt
            case '6' :
            case '7' ://NOTE: by placing apostrephese, the program is
            case '8' ://recognizing the input as chars and not ints
            case '9' : return c;
            default: response = "You did not enter an acceptable character; try again: ";
                     break ;
        }
        
        System.out.println(response);
        c = getInput(x,command,y);
        return c;
    }
 
    //Code given and copied from the professor
    //All methods are used inside the main method
    public static void main(String[] arg) {
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit - ");
        input = getInput(scan,"Cc");
        System.out.println("You entered "+input);
        System.out.print("Enter 'y', 'Y', 'n', or 'N': ");
        input = getInput(scan,"yYnN", 5);
        
        if(input!=' ') {
            System.out.println("You entered "+input);
        }
        
        input=getInput(scan,"Choose a digit:","0123456789");
        System.out.println("You entered "+input+"");
    }
}