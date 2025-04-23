package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        String[] famousQuotes = {
                "I think, therefore I am.", "Just do it.",
                "Stay hungry, stay foolish.", "Knowledge is power.",
                "Less is more.", "Be yourself; everyone else is already taken.",
                "Simplicity is the ultimate sophistication.", "To be, or not to be.",
                "Time is money.", "In the middle of difficulty lies opportunity."
        };

        Scanner myScanner = new Scanner (System.in);

        boolean quote = true;

        while(quote) {

            try {
                //ask the user for a number
                System.out.println("Please give me a number between 1 and 10");
                int numberSelected = myScanner.nextInt();

                //print out the quote that matches the numnber, remember to subtract 1 since
                //the user is counting from 1 and the list starts at 0
                System.out.println(famousQuotes[numberSelected - 1]);
            } catch (Exception e) {
                System.out.println("something went wrong but lets start over");
                continue;
            }

            //eat the leftover newline
            myScanner.nextLine();

            System.out.println("Do you want to choose another quote? (y/n)");
            String userAnswer = myScanner.nextLine();


            if(userAnswer.equalsIgnoreCase("y")){
                continue;
            }else{
                quote = false;
            }
        }
    }
}