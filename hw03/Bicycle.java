//Juan Pablo Ferrer
//September 16, 2014
//CES2 Sec 111
//hw03 - Bicycle
//This program will allow the user to input the amount of time (in seconds)
//and the counts in a trip in order to compute the distance traveled and
//the average speed (in miles) of the entire trip. Very similar to the "Cyclometer"

import java.util.Scanner; //First got to import the scanner to avoid compiling errors
public class Bicycle {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print(
            "Enter the number of seconds: ");
            int nSeconds = myScanner.nextInt();
        //Command asking user to input number of seconds
        System.out.print( 
            "Enter the number of counts: ");
            int nCounts = myScanner.nextInt();
        //Command asking user to input number of counts
        //These commands allow the user to input the data
            
        double wheelDiameter = 27.0, // 27 inches = 0.000426136 miles
        PI=3.14159,                  // Pi is required to find the distance
        inchesPerFoot=12,            // Conversion from Inches <-> Foot
        feetPerMile= 5280,           // Conversion from Feet <-> Mile
        secondsPerMinute = 60,       // Conversion from Seconds <-> Minutes
        secondsPerHour = 3600;       // Conversion from Seconds <-> Hours
        
        //Setting up variables in order to simplify the overall equation
        double Distance, nMinutes, Average; 
        Distance = ((nCounts*wheelDiameter*PI)/(inchesPerFoot*feetPerMile)); //Distance travelled
        nMinutes = (nSeconds/secondsPerMinute);  //Minutes the trip took (Important to convert to minutes)
        Average = (Distance/(nSeconds/secondsPerHour)); //Average speed done by dividing the distance/time in hours
       
        System.out.println ("The distance was "+(int)(Distance*100)/100.0+
                        " miles and took "+nMinutes+" minutes");
        System.out.println ("The average mph was "+(int)(Average*100)/100.0);
        //Casting the int in order to eliminate extra decimal places and
        //rounding out the value to the nearest tenth
    }
}