package myapp;

import java.io.Console;
import java.security.SecureRandom;
import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {

         //Create a random number generator
         Random rand = new SecureRandom();

         //Generate a number between 1-10
         int toGuess = rand.nextInt(10)+1;
 
         System.out.printf(">>> To guess: %d\n", toGuess);
 
         //Get input from user
         Console cons = System.console();
 
         //Set a variable called tries
         int tries = 0;
 
         //boolean didWin = false;
         
 
         //Check if we have guessed 3 times
         while (tries <3) {
 
             //Get input
             String input = cons.readLine("Guess a number between 1-10.");
             int myGuess = Integer.parseInt(input);
 
             if (myGuess > toGuess){
                 System.out.printf("Too high\n");
 
             } else if (myGuess < toGuess) {
                 System.out.printf("Too low\n");
 
             } else {
                 System.out.printf("YOU WIN!");
                 System.exit(0);
                 //Exit the while loop
                 //didWin = true;
                 //break;
             }
             tries = tries +1;
            //tries += 1;
            //tries ++;

        } //while loop
    
        //if (!didWin) {
        System.out.println("YOU LOSE!");
        //}

    }    



}
