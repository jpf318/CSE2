//Juan Pablo Ferrer
//September 24, 2014
//CSE2 Sec 111
//Lab05 - RandomGames

import java.util.*;
public class RandomGames {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter R or r for Roulette, C or c for Craps, P or p for pick a card: ");
        String sInput = myScanner.next();
        char gameDecision = sInput.charAt(0);
        int sLength = sInput.length();
        if (sLength == 1) {
            if (gameDecision == 'R' || gameDecision == 'r') {
                int roulette = (int)(Math.random()*37) + 1;
                String rResult;
                switch (roulette) {
                    case 37 : rResult = "00";
                    break;
                    default: rResult = ""+roulette;
                    break;
                }
                System.out.println("Roulette: "+rResult);
            
            } else if (gameDecision == 'P' || gameDecision == 'p') {
                String pResult = "";
                int nCard = (int)(Math.random()*13) + 1;
                String card;
                switch (nCard) {
                    case 1 : card = "A";
                    break;
                    case 11 : card = "J";
                    break;
                    case 12 : card = "Q";
                    break;
                    case 13 : card = "K";
                    break;
                    default : card = ""+nCard;
                    break;
                }
                
                pResult += card+" of ";
                
                int nSuit = (int)(Math.random()*4) + 1;
                String suit ="";
                switch (nSuit) {
                    case 1 : suit = "Diamonds";
                    break;
                    case 2 : suit = "Clubs";
                    break;
                    case 3 : suit = "Hearts";
                    break;
                    case 4 : suit = "Spades";
                    break;
                }
                
                pResult += suit;
                System.out.println(pResult);
                
            } else if (gameDecision == 'C' || gameDecision == 'c') {
                int dice1 = (int)(Math.random()*6) + 1;
                int dice2 = (int)(Math.random()*6) + 1;
                int cResult = dice1 + dice2;
                System.out.println("Craps: "+dice1+" + "+dice2+" = "+cResult);
            
            } else {
                System.out.println("'"+gameDecision+"' is not one of 'R','r','C','c','P', or 'p'");
            }
            
        } else {
            System.out.println("A single character expected");
        }
    }
}