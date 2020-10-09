/*

Partners assignment: math game for two 

Write a program with your partner that works as a two player math game in the console. 
It should print out some sort of message letting you know the rules of the game. 
It should ask if you want to start the game. 
It will then randomly generate math questions (simple addition) one at a time for the players to answer. 
After every round you will print the current number of lives remaining. Each player will have 3 lives. Sample output/input is below:

Hello and welcome to the two player math game, would you like to play? (y/n)
Y
You each have 3 lives
Player 1: what is 7 + 9
16
Correct!

The lives: Player 1: 3/3 Player 2: 3/3
Player 2: What is 10 + 10
19
Incorrect! The answer was 20. 
The lives: player 1: 3/3 Player 2: ⅔
.
.
The lives: player 1: 3/3 player 2: 0/3
Player 1 wins!


hint : while loops will be extremely useful in solving this problem. 

*/

// Group members Hiro and Yuri.

import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {

        int count = 1;

        int lifeOfPlayer1 = 3;
        int lifeOfPlayer2 = 3;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello and welcome to the two player math game, would you like to play? (y/n)");
        String isContinue = input.nextLine();

        if (isContinue.equals("y") || isContinue.equals("Y") ) {

            while (!(lifeOfPlayer1 == 0 || lifeOfPlayer2 == 0)) {
                // Generate two random numbers
                int firstNumber = (int)(Math.random() * 100) + 1;
                int secondeNumber = (int)(Math.random() * 100) + 1;
    
                int computerAnswer = firstNumber + secondeNumber;
    
                if (!(count % 2 == 0)) {
                    System.out.println("The lives: Player 1: " + lifeOfPlayer1 + "/3 Player 2: " + lifeOfPlayer2 + "/3");
                    System.out.println("You each have 3 lives\nPlayer 1: what is " + firstNumber + " + " + secondeNumber);
                    int userAnswer = input.nextInt();
    
                    if (userAnswer == computerAnswer) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Incorrect! The answer was " + computerAnswer);
                        lifeOfPlayer1--;
                    }
                    count++;
    
                } else if (count % 2 == 0) {
                    System.out.println("The lives: Player 1: " + lifeOfPlayer1 + "/3 Player 2: " + lifeOfPlayer2 + "/3");
                    System.out.println("You each have 3 lives\nPlayer 2: what is " + firstNumber + " + " + secondeNumber);
                    int userAnswer = input.nextInt();
    
                    if (userAnswer == computerAnswer) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Incorrect! The answer was " + computerAnswer);
                        lifeOfPlayer2--;
                    }
                    count++;
                }
                System.out.println("######################################");
            }

            if (lifeOfPlayer1 > lifeOfPlayer2) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("Player 2 wins!");
            }

        } else if (isContinue.equals("n") || isContinue.equals("N")) {
            System.out.println("See you next time!");
        } else {
            System.out.println("InValid value. Please write 'y' or 'n'.");
        }
    }
}