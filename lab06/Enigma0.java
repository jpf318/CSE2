//Juan Pablo Ferrer
//September 24, 2014
//CSE2 Sec 111
//Lab06 - Enigma0

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    Scanner scan; 
    scan = new Scanner (System.in);

    System.out.print("Enter an int- ");
    
    int k=4,p=6,q=7,r=8;
    if(scan.hasNextInt()){
        int n = scan.nextInt();
        System.out.println("You entered "+n);
        switch(k+p+q+r){
            case 24:
                break;
            case 25: System.out.println("sum is 25");
                break;
        }
    System.out.println("To repeat, you entered "+n);
    }
    else{
      int n = 4;
      System.out.println("You entered "+n);
      switch(k+p+q+r){
            case 24:
                break;
            case 25: System.out.println("sum is 25");
                break;
        }
    System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 */

