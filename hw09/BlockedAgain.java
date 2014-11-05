//Juan Pablo Ferrer
//November 4, 2014
//CSE2 Sec 111
//HW09 - BlockedAgain
/*This program will ask the user to input a number from
  1 to 9 and will design a tower like structure using the
  inputed value as a method of figuring out the height of
  the tower. This program utilizes methods and loops in order
  to build the tower. */
  
import java.util.Scanner;
public class BlockedAgain {

    //1st Method - Focus on getting the input from the user
    static int getInt() {
        Scanner myScanner = new Scanner(System.in);

        //Command asking for user input
        System.out.print("Enter an int between 1 and 9, inclusive: ");
        boolean validInput = false;
        int input=0;
        while(!validInput) {  //While loop in order to eliminate other possibility

            if(checkInt(myScanner)) {  //Calls for another method
                input = myScanner.nextInt(); 
                if( checkRange(input) ){
                    validInput = true;
                }
            } else {
                myScanner.next();
            }
        }

        return input;
    }
    
    //Second method - checks if the inputed data is indeed an integer
   static boolean checkInt(Scanner myScanner) {
        if(myScanner.hasNextInt()) {
            return true;
        } else {
            System.out.print("You did not enter an integer, try again: ");
            return false;
        }
    }

    //Third method - checks if the integer inputted is in the range permitted
    static boolean checkRange(int input) {
        if(input >= 1 && input <= 9 ) {
            return true;
        } else {
            System.out.print("You did not enter an int in [1,9}; try again: ");
            return false;
        }
    }

    //Fourht Method - In charge of designing and building the tower
    static void allBlocks(int input) {
        int flimit = input + (input-1);
        for ( int x = 1; x <= input; x++ ) {
            block(x, flimit);
        }
    }

    //Fifith Method - Focuses on the design and overall repetition
    //of the numbers and values assigned in order to build the blocks
    //of the tower. Aside from that, also manages to print out the lines
    //between each block of numbers
    
    static void block(int input, int flimit) {
        int limit = input + (input-1);
        int margin = (flimit - limit)/2;

        // rows of numbers
        for ( int x = 1; x <= input; x++ ) {
            line(input, flimit);
        }
        // row of lines
        for ( int x = 0; x < margin; x++ ) {
            System.out.print(" ");
        }
        for ( int x = 1; x <= limit; x++ ) {
            System.out.print("-");
        }
        for ( int x = 0; x < margin; x++ ) {
            System.out.print(" ");
        }
        System.out.println();
    }

    //Method six - Focuses on the creation of the margins and centers the
    //the entire tower. Although there are some issues, it still manages to
    //center some of the blocks
    
    static void line(int input, int flimit) {
        int limit = input + (input-1);
        int margin = (flimit - limit)/2;
        for ( int x = 0; x < margin; x++ ) {
            System.out.print(" ");
        }
        for ( int x = 1; x <= limit; x++ ) {
            System.out.print(input);
        }
        for ( int x = 0; x < margin; x++ ) {
            System.out.print(" ");
        }
        System.out.println();
    }

    //Main Method given by the professor
    public static void main(String []s) {
        int m;
        //force the user to enter int in range 1-9, inclusive.
        m = getInt() ;

        allBlocks (m) ;
    }
}