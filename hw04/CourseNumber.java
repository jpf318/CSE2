//Juan Pablo Ferrer
//September 23, 2014
//CSE2 Sec 111
//HW04 - CourseNumber
//This program allows the user to determine the semester and year
//he/she has taken by just inserting a series of values.
//The progrma will ask for the user's input and will display
//the semester and year the user took that course
//Similar to what universities use to manage courses
import java.util.Scanner;
public class CourseNumber{
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in); //Begin by importing and naming your scanner

        System.out.print("Enter a six digit number giving the course semester: ");

        if (myScanner.hasNextInt()){
            int input = myScanner.nextInt();
            if (input < 186510 || input > 201440){ //Creates a range which the user must respect
                System.out.println("The number was outside the range [186510,201440]");
                return;
            }
            else {
                int course = input % 100; 
                    //By placing a reminder, the program will only focus on the last two values 
                int year = (input - course)/100;
                    //By substracting the course value, the input will only display the year
                boolean invalidSemester = false;
                String semester= "";
                    //This will allow the integration of a switch function
                switch (course) {
                    case 10:semester = "Spring";
                        break;
                    case 20:semester = "Summer 1";
                        break;
                    case 30:semester = "Summer 2";
                        break;
                    case 40:semester = "Fall";
                        break;
                    default:invalidSemester=true;
                        break;
                        //The switch function, what essentially does is, evaluates the value
                        //inputed and compares it with different cases. If the value matches with
                        //a case, a specific message will be displayed. Something very important to
                        //remember about using "switch" is that for every case, a "break" must be used
                }

                if (invalidSemester)
                    System.out.println(course+" is not a legitimate semester");
                else
                    System.out.println("The course was offered in the "+semester+" semester of "+year);
                    //This if statement will identify if the semester is legitimate and
                    //will display a message / alert to the user
                }
        
        }else{
          System.out.println("The number you entered was not an int");
        }
    }
}