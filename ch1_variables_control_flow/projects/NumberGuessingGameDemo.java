package ch1_variables_control_flow.projects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameDemo {
    public static void main(String[] args) {
        // generate random number
        // ask user for input
        // check if input is correct
        // if its correct end game
        // if not give him a hint too far or too high
        // maximum number of attempts is 3
        int numberToGuess = new Random(0).nextInt(1,100);
        Scanner scanner = new Scanner(System.in);
        String gamePromptMessage = "Please enter a number between 1 and 100";
        String gameSuccessMessage = "Good Job!";
        int userInput = 0;
        int numberOfAttempts = 3;
        int attemptsCount=0;
        if(Arrays.stream(args).anyMatch(s -> s.contains("--debug"))){
            System.out.println("you are running in debug mode random number is "+ numberToGuess);
        }
        while(attemptsCount <numberOfAttempts){
            attemptsCount++;
            System.out.println(gamePromptMessage);
            userInput = scanner.nextInt();
            if(userInput == numberToGuess){
                System.out.println(gameSuccessMessage);
                break;
            }else{
                String gameFailMessage = userInput > numberToGuess ? "bad Guess you are too High!": "bad Guess you are too Low";
                System.out.println(gameFailMessage);
            }
        }
    }
}
