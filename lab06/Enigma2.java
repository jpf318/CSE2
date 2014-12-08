import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12:
        break;
      case 13: out += 13;
        break;
      case 40: out += 40;
        break;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * The java.lang allows the programmer to understand the problems
 * and where exactly the error is located. In this case the problem
 * was located in the 11th line and it was regarding the fact that 
 * 40 was being devided by 0, something that is undefined. The error 
 * specified this was the problem, so it was easier to solve
 */