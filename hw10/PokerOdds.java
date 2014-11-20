//Juan Pablo Ferrer
//November 18, 2014
//CSE2 Sec 111
//HW10 - PokerOdds.java
/*This program will randomly choose from a normal deck of card,
  5 cards which will later be shown to user. After randomly
  choosing a hand, the computer will ask the user to continue or
  repeat the process. The second part of the program is that the
  program will calculate the probabilities of a rank to come up
  in a hand after dealing 10000 different hands. This program uses
  methods and arrays*/

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{

    //These are global arrays which will be called and used throughout
    //the entire program and in different methods
    static final String[] suits = new String[] {"Clubs","Diamonds","Hearts","Spades"};
    static final String[] ranks = new String[] {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
    static int[] hand = new int[5];
    static int[] deck = new int[52];

    //Main method provided by the professor
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }
    //This method will serve as a foundation and will
    //call upon many other methods. Simply focuses on 
    //displaying the hand
    public static void showHands() {
       Scanner scan = new Scanner(System.in);
       String answer = "";
       do{

          //Utilizes another method which focuses on the creation
          //of the hand itself
          hand = createHand(deck);
          
          //Calls for another method which focuses on simply printing
          //the selected cards and it's suits
          printHand(hand);

          System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
          answer=scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
        return;
    }

    //Considered the second part of the program, which will focus
    //on repeating the same process as above 10000 and then selecting
    //each suit and rank in order to see their probabilities of coming
    //up every 10000 deals. 
    public static void simulateOdds() {
      int[] stats = new int[13];
      int noDupes = 0;
      for (int i=0; i < 10000; i++) {
        int[] cardValues = new int[5];
        int[] cardRanks = new int[5];
        cardValues = createHand(deck);
        cardRanks = getRanks(cardValues);
        // printHand(cardValues);

        //By utilizing the code previously done in the previous program
        //the method will be able to check for any exact duplicates
        //which in turn will be included in the stats which will be 
        //printed out accordingly to their ranks
        boolean oneDupe = FindDuplicates.exactlyOneDup(cardRanks);
        if (oneDupe){

          int duplicateRank=0;
          for (int j = 0; j<cardRanks.length  ; j ++ ){
            int card = cardRanks[j];
            for(int k = 0; k < cardRanks.length; k++) {
              if(k != j && cardRanks[j] == cardRanks[k]) {
                // counter = counter+1;
                duplicateRank = cardRanks[j];
              }
            }
          }

          stats[duplicateRank] = stats[duplicateRank]+1;
        }else{
          noDupes++;
        }
      }
    
    //These are the print out statements for the second program
      System.out.println("Rank\tFreq of Exactly one pair");
      for (int i = 0; i < stats.length; i++) {
        System.out.println(ranks[i] + "\t" + stats[i]);
      }
      System.out.println("-------------------");
      System.out.println("total not exactly one pair: "+noDupes);
      return;
    }

    //This method focuses on creating the card, which will be later
    //displayed for the user to obeserve. It utilizes the global arrays
    //in order to print and find each probability for each rank
    public static int[] createHand(int[] deck){

      int[] hand = new int[5];

      for (int i=0; i < 52; i++) {
        deck[i] = i;
      }

      for (int i = 0; i < 5; i++) {
        int rnd = (int) (Math.random()*(51-i));
        hand[i] = deck[rnd];
        for ( int j = rnd ; j < deck.length - 1 ; j++ ) {
          deck[ j ] = deck[ j + 1 ] ;
          deck[ deck.length - 1 ] = -1;
        }
      }
      return hand;
    }

    //In order to single out the ranks from the suits,
    //this method simply finds the legth of the hand
    //and checks to see only the ranks of each hand
    public static int[] getRanks(int[] hand){

      int[] temp = new int[5];

      for (int k=0; k<hand.length; k++) {
        int card = hand[k];
        int rank = card%13;
        temp[k] = rank;
      }

      return temp;

    }

    //This methods simply focuses on the printing of the hands
    //and does not incur in any other actions whatsover
    public static void printHand(int[] hand){

      for (int i = 0; i < suits.length; i++) {
        System.out.print(suits[i] + ": ");
        for (int k=0; k < hand.length; k++) {
          int card = hand[k];
          int rank = card%13;
          if(card/13 == i) {
            System.out.print(ranks[rank] +" ");
          }
        }

        System.out.println();
      }

    }
}