import java.util.*;
public class Arrays {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter 10 ints: ");
        
        int input []  = {myScanner.nextInt()};
        for ( int i = 0 ; i < 10 ; i++) {
            System.out.println(input[i] + " ");
        }
    }
}