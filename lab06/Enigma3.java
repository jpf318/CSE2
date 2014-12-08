/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    
    //System.out.println(n+" "+k);
    
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    
    //System.out.println(n+" "+k);
    
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
        break;
      default:
        n-=3;
        k-=5;
        break;
    }
    
    //System.out.println(n+" "+k);
    
    out += 1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * The problem was that when the values were initialized in
 * the switch statement, due to the lack of break statements
 * the program would enter this value and continue the processes
 * in the rest of the switch statement no matter their case
 * the solution to this problem involved inserting the proper
 * break statement in their respective areas
 */
