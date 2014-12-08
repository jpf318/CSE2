import java.util.*;
public class Arrays {
    public static void main(String [] args) {
        int [] array1 = new int[10];
        
        int total = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter 10 ints: ");
        
        for (int i = 0; i < array1.length; i++) {
            array1[i] = myScanner.nextInt();
        }
        
        int min = array1[0];
        int max = array1[9];
        
        for (int j = 0; j < array1.length; j++) {
            if (min > array1[j]) {
                min = array1[j];
            } else if (array1[j] > max) {
                max = array1[j];
            }
            total += array1[j];
        }
        
        System.out.println("The lowest entry is "+min);
        System.out.println("The highest entry is "+max);
        System.out.println("The sum is "+total);
        
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]+"\t"+array1[9-i]);
        }    
    }
}