//Juan Pablo Ferrer
//December 5, 2014
//CSE2 Sec 111
//HW11 - PokerHands
/*This program will ask the user to input a poker hand
   and the program will eventually display it for the
   user to see. Aside from displaying it, the program 
   will also point out what hand does the user has (e.g Flush).
   This program utilizes Methods, Arrays and Sorting*/

import java.util.*;
public class PokerHands {
    
    //By having these arrays seperate from all methods, the programmer
    //is able to utilize it throughout the program without being accidentally
    //changing it.
    static final String[] suit = new String[] {"Clubs","Diamonds","Hearts","Spades"};
    static final String[] ranks = new String[] {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};

    //Given the importance of these arrays, they are placed inside the public class
    //but intialized outside of the main one giving them presendance throughout
    //the entire class.
    static int [] deck = new int [52];
    static int [] hand = new int [5];
    static int [] rankFrequency = new int [13];
    static int [] frequencyCount = new int [5];

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Each for loop is used to fill in the previously initialized
        //arrays with certain values, which are going to be important laterr
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int i = 0; i < rankFrequency.length; i++) {
            rankFrequency[i] = 0;
        }
        for (int i = 0; i < frequencyCount.length; i++) {
            frequencyCount[i] = 0;
        }

        //Although it is a bit wierd to ask for an input to run at 
        //the beginning, the program asks an input to initialize
        
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ") ;

        
        while (myScanner.next().charAt(0) == 'y' || myScanner.next().charAt(0) == 'Y') {
            int i = 0;
            while (i < hand.length) {
                int nSuit = 4;
            
                do {
                    //Asks the user for the suit of the card they want to choose
                    
                    System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");
                    char suit = myScanner.next().charAt(0);
                    switch (suit) {
                        case 'c' : nSuit = 0;
                            break;
                        case 'd' : nSuit = 1;
                            break;
                        case 'h' : nSuit = 2;
                            break;
                        case 's' : nSuit = 3;
                            break;
                        default:
                        System.out.println("You did not enter a valid response");
                    }
                } while (nSuit == 4);

                int nRank = 14;

                do {
                    //Asks the user for the rank they want for the chosen card
                    //and evaluates if you already chose that card
                    System.out.print("Enter of 'a', 'k', 'q', 'j', '10', ... '2': ");
                    String rank = myScanner.next();
                    switch (rank) {
                        case "a" : nRank = 0;
                            break;
                        case "k" : nRank = 1;
                            break;
                        case "q" : nRank = 2;
                            break;
                        case "j" : nRank = 3;
                            break;
                        default :
                            int temp = Integer.parseInt(rank);
                            if (temp > 1 && temp < 11 ) {
                                nRank = 14 - temp;
                            } else {
                                System.out.println("You did not enter a valid response");
                            }
                            break;
                    }
                } while (nRank == 14);

                int temp = (nSuit*13)+nRank;
                
                //The deck must be checked in order to see
                //if the user has already chosen this card
                //making it impossible to repeat cards
                if(deck[temp] != -1){
                    hand[i] = temp;
                    deck[temp] = -1;
                    i++;
                } else {
                    System.out.println("You already entered that card");
                }

            }
            showOneHand(hand);

            //By filling in the rankFrequency array, the program
            //is able to evaluate which ranks have been repeated
            //and evaluate if there are any pairs, triples, and or pokers
            for (int card : hand){
                int t = card%13;
                rankFrequency[t] = rankFrequency[t]+1;
            }

            for (int rankF : rankFrequency){
                frequencyCount[rankF] = frequencyCount[rankF]+1;
            }
            
            //In order to not over complicate the main method, each hand
            //is evaluated using a wide range of methods
            
            if (isRoyalFlush()) {
                System.out.println("Royal Flush");
            } else if (isStraightFlush()) {
                System.out.println("Straight Flush");
            } else if (isPoker()) {
                System.out.println("Four of a Kind");
            } else if (isFullHouse()) {
                System.out.println("Full House");
            }else if (isFlush()) {
                System.out.println("Flush");
            } else if (isStraight()) {
                System.out.println("Straight");
            } else if (isTwoPair()) {
                System.out.println("Two Pair");
            } else if (isOnePair()) {
                System.out.println("One Pair");
            } else {
                System.out.println("High Card");
            }
            
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ") ;
        }
       return;     
    } 

     //1st Method focuses on printing out the user's hand
     //by using the array already created in the main method
     
     public static void showOneHand(int[] hand){

        for (int i = 0; i < suit.length; i++) {
                System.out.print(suit[i] + ": ");
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

    //2nd Method focuses on evaluating the rankFrequency
    //and hand array to check if the user has a straight
    public static boolean isStraight(){
        boolean start = false;
        int count = 0;
        for (int i : rankFrequency) {
            if(i == 1){
                if(start){
                    count++;
                }else{
                    start=true;
                    count++;
                }
            }else{
                if(start){
                    count = 0;
                    start = false;
                }
            }
        }

        return (count == 5);
    }

    //3rd Method focuses on evaluating the hand and each
    //card to check if there are 5 cards with the same
    //suit and call it a flush. 
    public static boolean isFlush(){
        int rank = hand[0]/13;
        boolean output = true;

        for (int i : hand) {

            if( (i/13) != rank){
                output = false;
            }
        }

        return output;
    }

    //4th Method simply utilizes both methods previously
    //described to check if both properties are correct
    //and recognize the user's hand as a straight flush
    public static boolean isStraightFlush(){
        return (isFlush() && isStraight());
    }

    //5nd Method must only be initialized if there is a straightflush,
    //given that a Royal Flush must contain (A,K,Q,J,!0) of the same
    //suit. If these statements are true, than it must send true and 
    //consider the hand as a Royal Flush
    public static boolean isRoyalFlush(){
        if(isStraightFlush()){
            if(rankFrequency[0]==1 && rankFrequency[4]==1){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    //The remaining Methods only focus on analyzing the frequencyCount array
    //and checking if they have a distinct feature which will allow the program
    //to define if the hand is eather a poker, full house, or pairs.
    public static boolean isPoker(){
        return (frequencyCount[4]==1);
    }

    public static boolean isFullHouse(){
        return (frequencyCount[3]==1 && frequencyCount[2]==1);
    }

    public static boolean isTwoPair(){
        return (frequencyCount[2]==2);
    }

    public static boolean isOnePair(){
        return (frequencyCount[2]==1);
    }
}