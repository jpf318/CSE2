//Juan Pablo Ferrer
//October 21, 2014
//CSE2 Sec 111
//HW07 - NumberStack
/*This program will ask the user to input a positive integer
  respecting the given range of 1-9. After inputing the value
  the program will design a tower. The height of the tower
  will depend on the value inputed. This program explores the 
  uses of for, while and do while loops.*/

//Begin by importing the scanner which will allow the user to input data
import java.util.*;
public class NumberStack {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //Prompt requesting the user to input a value (respecting the range)
        System.out.print(
            "Enter a number between 1 and 9: ");
        
        if(myScanner.hasNextInt()) {
            int input = myScanner.nextInt();
            if (input > 0 && input < 10) {
                
                //1st Stack (For Loops)
                System.out.println("Using for loops: ");
               
                // a is current number
                for ( int a = 1; a <= input; a++ ) {
                    int limit = a + (a-1);
                    
                    // b is row number
                    for ( int b = 1; b <= a; b++ ) {
                       
                        // c is col number
                        for ( int c = 1; c <= limit; c++ ) {
                            System.out.print(a);
                        }
                    
                        System.out.println();
                    }
                    
                    for ( int b = 1; b <= a+(a-1); b++ ) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
                System.out.println();
                
                
                //2nd Stack (While Loops)
                System.out.println("Using while loops: ");
    
                int e = 1;
                
                // e is the current number (the beginning)
                while ( e <= input ) {
                    int limit = e + (e-1);
                    int f = 1;
                    
                    // f represents the number of rows
                    while ( f <= e ) {
                        int g = 1;
                        
                        //g represents the number of columns
                        while ( g <= limit) {
                            System.out.print(e);
                            g++;
                        }
                        
                        System.out.println();
                        f++;
                    }

                    //While loop for row of lines
                    int h = 1;
                    while ( h <= e+(e-1) ) {
                        System.out.print("-");
                        h++;
                    }

                    System.out.println();
                    e++;
                }
                System.out.println();


                //3rd Stack (do-while loop)
                System.out.println("Using do-while loops: ");
                
                //i is the current value, already defined
                int i = 1;
                //j is the number of rows
                do {
                    int limit = i + (i-1);
                    int j = 1;
                    
                    //k is the number of columns
                    do {
                        int k = 1;
                        
                        do {
                            System.out.print(i);
                            k++;
                        
                        //While for number in columns  
                        } while ( k <= limit);
                        System.out.println();
                        j++;
                    
                    //While for number in rows    
                    } while ( j <= i );

                    int k = 1;
                    
                    //The row of lines "-"
                    //It must be included inside the general loop and repeated
                    do {
                        System.out.print("-");
                        k++;
                        
                    } while ( k <= i+(i-1) );

                    System.out.println();
                    i++;

                //While for general loop, initial number
                } while ( i <= input ); {
                    
                }
                
            } else {
                //Error message which will be prompted if the user is unable to input a value
                System.out.println("Error: Your number is not in the designated range (1-9)");
            }
             
        } else {
            
            System.out.println("Error: You have not entered an integer");
    
        }
    }
}