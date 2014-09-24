//Juan Pablo Ferrer
//September 23, 2014
//CSE2 Sec 111
//HW04 - TimePadding
//This program will request the user to input a random number of seconds
//The program will display that amount of seconds in a conventional way (##:##:##).
//The program also simplifies the convertion from seconds to minutes and hours

import java.util.Scanner;
public class TimePadding{
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);

        System.out.print(
            "Enter the time in seconds: "); //Input Request, amount of seconds
            
        if(myScanner.hasNextInt()){
            int input = myScanner.nextInt();
            int minutes = (input/60)%60;
            int hours = (input/60)/60;
            int seconds = input % 60;
           
            //By placing "%", the program is able to simply focus on the 
            //reminder when the number is divided by 60, to get the reminder
            //and use it to represent another variable, in this case minutes or seconds
            
            if (input > 0 )
                System.out.format("The time is %1d:%02d:%02d%n", hours, minutes, seconds);
                
                //By placing "%1d:%02d:%02d%n" the program knows that those values will
                //be taken from the next variables in the line of code. The first numbers
                //represent that the program must only display the two first numerical places
                //of the variable, and in the case there is no value in a specific numerical place,
                //the program would use a "0" to represent the spot
                
            else
                System.out.println("The number entered is not a positive int");
        } else {
            System.out.println("The number you entered is not an int");
        }
    }
}