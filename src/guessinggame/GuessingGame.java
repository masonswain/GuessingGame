package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int counter = 1;
        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.out.printf("I'm thinking of a number between 0-100.  What is the number? ");
        int guess = input.nextInt();        
        while (!exit) {            
            if (guess == result) {
                System.out.println("You got it in " + counter + " tries!");
                exit = true;
            }                
            else {
                if (guess < result) {
                    counter++;
                    System.out.printf("Nope.  Too low.  Try again: ");
                    guess = input.nextInt();
                } else {
                    counter++;
                    System.out.printf("Nope.  Too high.  Try again: ");
                    guess = input.nextInt();
                }                
            }                            
        }        
    }   
}
