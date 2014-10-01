//Juan Pablo Ferrer
//September 30, 2014
//CSE2 Sec 111
//HW05 - BoolaBoola
/* This program will ask the user to evaluate a randomly
generated condition, If the user correctly solves the condition
by simply stating if its positive or negative, the user will be
rewarded with a message stating it was correct
This program mainly uses normal and nested if statements
in order to evaluate all of the possible random conditions*/

import java.util.Scanner;
public class BoolaBoola {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        /*Before starting, it is important to create our random condition / statement.
        This will be possible by assigning different values inside the statement*/
        boolean var1 = false;
        int random1 = (int)((Math.random()*2)+1);
        
        //It is important to cast the int in order for it to display a single
        //int and not a long decimal or fraction
        
        if(random1 == 1) {
            var1 = true;
        }
        //By placing a value such as 1 or 2 on the boolean statement
        //the program is able to randomly choose between 1 which equals true
        //and 2 which equals false. The boolean will be set according to the
        //number randomly generated
        
        boolean var2 = false;
        int random2 = (int)((Math.random()*2)+1);
        if(random2 == 1) {
            var2 = true;
        }
        
        boolean var3 = false;
        int random3 = (int)((Math.random()*2)+1);
        if(random3 == 1) {
            var3 = true;
        }
        //This same process is repeated for all values
        
        String and = "&&";
        String or = "||";
        //It is important to take note that these conditions
        //must be represented as STRINGS in order for them to 
        //be completely considered inside the statement
        
        String condition1;
        int random4 = (int)((Math.random()*2)+1);
        if(random4 == 1) {
            condition1 = and;
        } else {
            condition1 = or;
        }
        
        String condition2;
        int random5 = (int)((Math.random()*2)+1);
        if(random5 == 1) {
            condition2 = and;
        } else {
            condition2 = or;
        }
        //A similar process is used to define the condition
        // of the statment, but the only thing is that the
        //program will take into consideration these conditions
        //and create a proper conditional statement
        
        boolean solution = false;
        if (condition1 == and){
            if (condition2 == and){
                solution = var1 && var2 && var3;
            }
            else if (condition2 == or){
                solution = var1 && var2 || var3;
            }
            else if (condition1 == or){
                solution = var1 || var2 || var3;
            }
        }
        //These are all of the possible solutions, regarding the different conditions
        //By doing this we can check what the program calculated with the user's guess
        System.out.print(
            "Does "+var1+" "+condition1+" "+var2+" "+condition2+" "+var3+" have the value true(t/T) or false (f/F)?");
    
        char input = myScanner.next(".").charAt(0);
        if (input == 'f' || input == 'F') {
            if(solution == false){
                System.out.println("Correct");
                return;
            }
            if(solution == true){
                System.out.println("Wrong; try again");
                return;
            }
        }  
        else if (input == 't' || input == 'T') {
            if(solution == true){
                System.out.println("Correct");
                return;
            }
            if(solution == false){
               System.out.println("Wrong, try again");
                return; 
            }
        }
        else {
            System.out.println("Wrong; try again");
            return;
        }
        //By nesting the if statements, I avoided the ongoing compiling
        //error of how strings and booleans are incompatible. By doing
        //this the program will take them as two different required conditions
    }
}
