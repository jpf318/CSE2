//Juan Pablo Ferrer
//September 30, 2014
//CSE2 Sec 111
//HW05 - BurgerKing
/*This program will ask for the user to input his order in a
local burger king business. The program will ask the user to input
if the user is interested in ordering burgers, french fries or a soda.
This program mainly use switch statments in order to divide the different
options given to the user*/

import java.util.*;
public class BurgerKing {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);

        //Asking for the user input, requires to be in the range
        System.out.println("Enter a letter to indicate a choice of");
            System.out.println("Burger (B or b)");
            System.out.println("Soda (S or s)");
            System.out.println("Fries (F or f)");

        String input = myScanner.next();
        if(input.length()>1){

            System.out.print("a single character expected");
            return;

        }
        else {

            //By utilizing an switch statement the computer is able to evaluate
            //different situations and possible variable inputted by the user
            switch (input) {
                case "B": case "b": //User inputs B for burgers
                    System.out.println("Enter A or a for 'all the fixins' \n C or c for cheese \n N or n for none of the above");

                    //Request the user for the ingredients used to build the burger
                    String burger = myScanner.next();

                    //Must create a string which will later be evaluated
                    switch (burger) {
                        case "A": case "a":
                            System.out.println("You ordered a burger with 'all the fixins'");
                            break;
                        case "C": case "c":
                            System.out.println("You ordered a burger with cheese");
                            break;
                        case "N": case "n":
                            System.out.println("You ordered a plain burger");
                            break;
                        default:
                            System.out.println("Ingredient invalid");
                            System.out.println("You ordered a plain burger");
                            break;
                    }
                    break;

                    //By utilizing a nested switch, the program is able to follow through
                    //a certain direction or functions to follow according to their condition
                    //By doing this, it creates a clear path which the program will follow
                    //when evaluating the inputed data

                case "S": case "s":
                    System.out.println("Do you want Pepsi (P or p), Coke (C or c), Sprite (s or S) or Mountain Dew (M or m): ");
                    //Request the user to input which brand did the user order
                    String soda = myScanner.next();
                    switch (soda) {
                        case "P": case "p":
                            System.out.println("You ordered a Pepsi");
                            break;
                        case "C": case "c":
                            System.out.println("You ordered a Coke");
                            break;
                        case "S": case "s":
                            System.out.println("You ordered a Sprite");
                            break;
                        case "M": case "m":
                            System.out.println("You ordered a Mountain Dew");
                            break;
                        default:
                            System.out.println("Invalid soda ordered");
                            break;
                    }
                    break;
                        //It is always important to keep a default which in the
                        //case that the user wouldn't input one of the given
                        //options, the program wouldn't crash

                case "F": case "f":
                    System.out.println("Do you want a large (L or l) or small (s or S) order of fries: ");
                    //Request for the user to input the size of his/her fries
                    String size = myScanner.next();
                    switch (size) {
                        case "L": case "l":
                            System.out.println("You ordered large fries");
                            break;
                        case "S": case "s":
                            System.out.println("You ordered small fries");
                            break;
                        default:
                            System.out.println("Invalid size for fries");
                            break;
                    }
                    break;
                default:
                    System.out.println("You did not enter any of B, b, S, s, F, or f");
                    break;
            }
        }
        //The entire program can be summarized in a entire switch command
        //The naming of variables and strings can get sometimes complicated
        //given that they must follow a logical path and none should repeat
    }
}