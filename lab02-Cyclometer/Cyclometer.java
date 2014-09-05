/////////////////////////////////////
//Juan Pablo Ferrer
//September 5, 2014
//lab02-Cyclometer
//CSE2 Sec 111
//
//Program should calculate and print the time elapsed in seconds of different trips in a bycicle. A Cyclometer
//  first compile the program
//      javac Cyclometer/java
//  run the program
//      java Cyclometer//

public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
        int secsTrip1=480;  //How much time did the first trip last
        int secsTrip2=3220; //How much time did the second trip last
        int countsTrip1=1561; //The number of the front wheel rotations in the first trip
        int countsTrip2=9037; //The number of the front wheel rotations in the second trip
        double wheelDiameter=27.0, //
        PI=3.14159, //The value of PI
        feetPerMile=5280, //Conversion from Feet <-> Mile
        inchesPerFoot=12, //Conversion from Inches <-> Feet
        secondsPerMinute=60; //Conversion from Seconds <-> Minutes
        double distanceTrip1; 
        double distanceTrip2; 
        double totalDistance; //
   
    //Since I already defined all my variable, I will just need to print out my equations
   
    System.out.println("Trip 1 took "
        +(secsTrip1/secondsPerMinute)+" minutes and had"
        +countsTrip1+"counts.");
    System.out.println("Trip 2 took "
        +(secsTrip2/secondsPerMinute)+" minutes and had "
        +countsTrip2+" counts.");
        //Run the Calculations; store the values. Document your
        //calculation here
        
        distanceTrip1=(countsTrip1*wheelDiameter*PI);
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        
        distanceTrip1/=inchesPerFoot*feetPerMile; //This will give distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}
