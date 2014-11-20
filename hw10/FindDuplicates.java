//Juan Pablo Ferrer
//November 18, 2014
//CSE2 Sec 111
//HW10 - FindDuplicates
/*This program will ask the user to input a 10 numbers
  which will be introduced in an array. The program must
  check if the user has entered any duplicates or has
  repeated a number multiple times and just once. This
  program utilizes methods and arrays*/
  
import java.util.Scanner;
public class FindDuplicates{
    
    //The main method which was given by the professor
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        String answer="";
        do{
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
        
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            if(hasDups(num)){
                out+="has ";
            } else {
                out+="does not have ";
            }
        
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);    
        
            if(exactlyOneDup(num)) {
                out+="has ";
            } else {
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }

    //1st Method given by the professor which focuses on listing
    //the array for the user to see when displayed by the program
    public static String listArray(int num[]){
        String out="{";
        for(int j=0;j<num.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=num[j];
        }
        out+="} ";
        return out;
    }
  
    //2nd Method which focuses on analyzing the array and
    //checking if there are any repeated numbers or duplicates
   
    public static boolean hasDups(int[] x) {
        boolean test = false; //Initialized as false
        for(int i = 0; i < x.length; i++) { 
            for(int j = 0; j < x.length; j++) {
                //By having two for loops, one variable can continue
                //incrementing allowing it to be compared over and over
                //with the same variable until the end of the array
                
                if(i != j && x[i] == x[j]) { 
                    //We want to avoid the program from recognizing
                    //the same value as a duplicate amd that why i!=j is used
                    
                    test = true;
                    return test;
                }
            }
        }
        return test;
    }
  
    //3rd Method which focuses on utilizing a similar code
    //found in the 2nd method, but simply looking for one
    //single, unrepeated pair of numbers
    public static boolean exactlyOneDup(int[] x) {
        boolean test = false;
        int counter = 0;
      
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x.length; j++) {
                if(i != j && x[i] == x[j]) {
                  //In order to check if there is only one
                  //the program creates a counter for everytime
                  //a certain value is repeated
                  counter = counter+1;
                  }
            }
        }
          
        //The range of the counter is placed as 2, because afterall
        //when a number is repeated once, the system will do the same
        //function but switched, counting it as twice repeated. To avoid
        //this error, the counter's condition is place equal to 2
        if (counter == 2) {
            test = true;
            return test;
        } else {
            return test;
        }
    }
}

