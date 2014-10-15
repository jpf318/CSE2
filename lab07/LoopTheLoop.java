import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        /*System.out.print(
            "Enter an int between 1 and 15-");
            int input = myScanner.nextInt();*/
        
        //if(myScanner.hasNextInt()) {
            int nStars = 10, stars = 0;
            while (stars < nStars) {
                System.out.println("*");
                stars++;
                while (stars < nStars) {
                    System.out.println("*");
                    stars++;
                }
            }
        //} else { System.out.println("FUCK YOU"); }
    }
}