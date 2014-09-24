//Juan Pablo Ferrer
//September 23, 2014
//CSE2 Sec 111
//HW04 - Month
//This program will ask for the user to input a number representation of a month
//By placing this value, the program will compute how many days did the month had
//In the case for leap years, when the user input "2", the program would request the user
//to specify which year, and the program will display the amount of days for that year

import java.util.Scanner;
public class Month{
    public static void main(String[] args) {
        int monthDays=0;
        Scanner myScanner;
        myScanner = new Scanner (System.in);

        System.out.print(
            "Enter an int giving the number of the month (1-12): "); //Input Request

        if (myScanner.hasNextInt()){
            int input = myScanner.nextInt();
            if (input < 1 || input > 12) { //Creating a range the user must respect
                System.out.println("You did not enter an int between 1 and 12");
                return;
            }

            if (input == 4 || input == 6 || input == 9 || input == 11) {
                monthDays = 30; //Input matches any of these values would = 30 day
            }else if(input==2){ 
                System.out.print(
                    "Enter an int giving the year: "); //Input command to find if month was a leap year
                if (myScanner.hasNextInt()){
                    boolean leapYear = (input % 4 == 0 && input % 100 != 0) || (input %400 == 0);
                    //Equation for a leapyear is found in the textbook
                    if(leapYear)
                        monthDays = 29;
                    else
                        monthDays = 28; 
                        //If else statement does not require "squigly parenthesis" because
                        //its part of a single line of code, but still requires ";"
                }else{
                    System.out.println("You need to enter a positive int");
                    return;
                }

            }else{
                monthDays = 31; //Remember to finish off the overall if statement
            }

            System.out.println("The month has " + monthDays + " days");
        }else{
            System.out.println("You need to enter a valid integer"); //This command covers all possible numerical inputs
        }
    }
}