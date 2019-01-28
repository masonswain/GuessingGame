package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int low = 0;
        int high = 20;
        int result = r.nextInt(high-low) + low;
        System.out.printf("I'm thinking of a number between 0-20.  What is the number? ");
        int guess = input.nextInt();
        if (guess == result)
            System.out.println("You got it!");
        else
            System.out.println("Nope.  The number is " + result);
    }
    
}
