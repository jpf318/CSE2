//Juan Pablo Ferrer
//September 9, 2014
//CSE2 Sec 111
//hw02 - Arithmetic
//This program will allow me to compute how much did I spend
//at Walmart (including the sells tax) for the items given.
//This program acts somehow like a shopping list 

public class Arithmetic {
public static void main(String[] args) {
    int nSocks=3;              //Number of pairs of socks
    double sockCost$=2.58;     //Cost per pair of socks '$'
    int nGlasses=6;            //Number of drinking glasses
    double glassCost$=2.29;    //Cost per glass
    int nEnvelopes=1;          //Number of boxes of envelopes
    double envelopeCost$=3.25; //Cost per box of envelopes
    double taxPercentage=0.06; //PA Percentage Tax

//Important to declare (create) our values

    double totalSocksCost$, totalGlasssesCost$, totalEnvelopesCost$,
    totalSocksTax$, totalGlassesTax$, totalEnvelopesTax$,
    totalPurchaseCostB$, totalPercentageTax$,totalPurchaseCostA$;

//I have all of my variables defined, so now the calculations

    totalSocksCost$=nSocks*sockCost$;
    totalSocksTax$=totalSocksCost$*taxPercentage;

    totalGlasssesCost$=nGlasses*glassCost$;
    totalGlassesTax$=totalGlasssesCost$*taxPercentage;

    totalEnvelopesCost$=nEnvelopes*envelopeCost$;
    totalEnvelopesTax$=totalEnvelopesCost$*taxPercentage;

    totalPurchaseCostB$=totalEnvelopesCost$+totalGlasssesCost$+totalSocksCost$;
    totalPercentageTax$=totalPurchaseCostB$*taxPercentage;
    totalPurchaseCostA$=totalPurchaseCostB$+totalPercentageTax$;

        //It's time to print out / calculate all of the following information

    System.out.println("I bought "+nSocks+" pairs of socks at Walmart");
    System.out.println("each pair costs $"+sockCost$);
        //If the variable is at the end of the statement, eliminate '+' to avoid errors
    System.out.println("I spent $"+totalSocksCost$+" plus a sales tax of $"+(int)(totalSocksTax$*100)/100.0);
        //In order to eliminate the left over decimals, the double variable must by forced into a int
        //Aside from that, the value must be multiplied by 100 and divided by 100.0

    System.out.println("I bought "+nGlasses+" drinking glasses at Walmart");
    System.out.println("each glass costs $"+glassCost$);
    System.out.println("I spent $"+totalGlasssesCost$+ " plus a sales tax of $"+(int)(totalGlassesTax$*100)/100.0);

    System.out.println("I bought "+nEnvelopes+" box of envelopes at Walmart");
    System.out.println("each box costs $"+envelopeCost$);
    System.out.println("I spent $"+totalEnvelopesCost$+ " plus a sales tax of $"+(int)(totalEnvelopesTax$*100)/100.0);

    System.out.println("The total amount, before the tax, was $"+(int)(totalPurchaseCostB$*100)/100.0);
    System.out.println("The total sales tax was $"+(int)(totalPercentageTax$*100)/100.0);
    System.out.println("I paid a total of, counting sales tax, $"+(int)(totalPurchaseCostA$*100)/100.0);

    }
}