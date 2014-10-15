//Juan Pablo Ferrer
//October 14, 2014
//CSE2 Sec 111
//HW06 - Roulette
/*This program will choose a random number which will played
  in a roulette. The roulette will be spinned 100 times, and 
  from these spins the user will be able to see how much will
  the person earn and loss if they repeat this same process
  1000 times more*/

//Begin by importing the scanner which will allow the user to input data  
import java.util.*;
public class Roulette {
    public static void main(String[] args) {

        //Set the variable which will be required throughout the while loop
        int totalWinnings = 0; 
        int winningRounds = 0;
        int losingRounds = 0;
        int round = 0;

        //By implementing a loop, the program is drastically shorten,
        //and the program is able to repeat itself for 1,000 times without
        //the need of writing 1,000 different lines of code
        
        while( round < 1000 ) {
            int myNum = (int) (Math.random()*38);
            int winsInRound = 0;
            int spin = 0;

            while( spin < 100 ) { //Loop Nesting
                int random1 = (int) (Math.random()*38);
                if(myNum == random1) {
                    winsInRound++;
                    totalWinnings += 36;
                }
                spin++;
            }
            
           //By nesting a loop inside another loop, they are able to process
           //a different part of the program but in unison, making it possible
           //to shorten the entire program and making it more efficient

            if(winsInRound >= 3) {
                winningRounds ++;
            }else if( winsInRound == 0) {
                losingRounds ++;
            }

            round++;
        }
            //One of the main problems found while coding this program was 
            //managing variables and their scopes. Sometimes you may think
            //that by mentioning them somewhere, it will always be usable
            //throughout the program, but that is wrong
            
        System.out.println("Your total winnings are: $"+totalWinnings);
        System.out.println("You gross profit is: $"+(totalWinnings - 100000));
        
        //I was unsure of which to put if the gross profit or the total winning, so I displayed both of them
        //By demonstrating the gross profit, the user is able to see how much he/she has really lost playing
        
        System.out.println("You lost it all in "+losingRounds+" rounds");
        System.out.println("You had a profit in "+winningRounds+" rounds");
    }
}