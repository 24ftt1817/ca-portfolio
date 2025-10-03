import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand =new Random();

        String cont = "";
        int user = 0; 
        int computer = 0;
        int round = 0;
        int userScore = 0;
        int computerScore = 0;

        do {
        System.out.print("\nEnter rock (0), paper (1), scissor (2): ");
        user = input.nextInt();

        computer = rand.nextInt(3);

        String[] choice = {"rock", "paper", "scissor"};
        String result = "The computer is " + choice[computer] + ". You are " + choice[user] + ". ";
        
        if (user == computer) {
            result += "It is a draw.";
        }
            else if (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
                result += "You Win.";
                userScore++;
            }
                else if (user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
                    result += "You Lose.";
                    computerScore++;
                }
        System.out.println(result);
        round++;
        
        System.out.print("\nEnter y to play again: ");
        cont = input.next();
        } while (cont.equals("y"));
        System.out.println("\nIn the total of " + round + " round(s), You scored " + userScore + ", Computer scored " + computerScore );

        if (userScore == computerScore) {
            System.out.println("It is a draw game.");
        }
        else if (userScore > computerScore) {
            System.out.println("You won the game.");
        }
        else if (userScore < computerScore){
        System.out.println("You lose the game");
        }
    }
}
