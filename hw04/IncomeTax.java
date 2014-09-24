//Juan Pablo Ferrer
//September 23, 2014
//CSE2 Sec 111
//HW04 - IncomeTax
//This program will request the user to input the number of thousands
//earned by the user as an integer. The program will take this data
//and calculate the progressive tax according to that specific value
//In simple terms, this program can calculate your income tax 

import java.util.Scanner;
public class IncomeTax{
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);  //Import and name your scanner

        System.out.print(
            "Enter an int giving the number of thousands: ");
        if(myScanner.hasNextInt()){
            int input = myScanner.nextInt();
            int incomeTotal = input*1000;
            //It takes much less time to assign the variables before placing them
            //inside the if statements
           
            if (input < 0) {
                System.out.println("You did not enter a positive int");
                return;
            }
            else if(input < 20) {
                double incomePT = (int)((incomeTotal*0.05)*100)/100.0;
                System.out.println("The tax rate on $"+input+",000 is 5.0%, and the tax is $"+incomePT);
                return;
            }
            
            else if(input >= 20 && input < 40) {
                double incomePT = (int)((incomeTotal*0.07)*100)/100.0;
                System.out.println("The tax rate on $"+input+",000 is 7.0%, and the tax is $"+incomePT);
                return;
            }
            
            else if(input >= 40 && input < 78) {
                double incomePT = (int)((incomeTotal*0.12)*100)/100.0;
                System.out.println("The tax rate on $"+input+",000 is 12.0%, and the tax is $"+incomePT);
                return;
            }
            
            else if(input >= 78) {
                double incomePT = (int)((incomeTotal*0.14)*100)/100.0;
                System.out.println("The tax rate on $"+input+",000 is 14.0%, and the tax is $"+incomePT);
                return;
            }   
            //Rather than choosing a switch statement which would have of cut the length of my program
            //I decided to use else if statements because they allowed me to place special care
            //of certain values and their ranges. inside each else if statemtn, the income would
            //be multiplied by its respective tax rate. Remember to multiply and divide by 100 in order
            //eliminate decimal places
        
        } else {
            System.out.println("You did not enter an int");
        
            //Finish off the if statement with this else statement, covering the situation
            //where the user would use a double, rather than an int
        }
        
    }
}