import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int user = input.nextInt();

        int bigNumber = (int) (Math.random()*1000);
        int computer = bigNumber % 3;

        String[] choice = {"rock", "paper", "scissor"};
        int rock = 0, paper = 1, scissor = 2;
        String result = "The computer is " + choice[computer] + ". You are " + choice[user] + ". ";

        if (user == computer) {
            result += "It is a draw.";
        }
            if (user == rock && computer == scissor) {
                result += "You Win.";
            }
                if (user == rock && computer == paper) {
                    result += "You Lose.";
                }
                    if (user == paper && computer == rock) {
                        result += "You Win.";
                    }
                        if (user == paper && computer == scissor) {
                            result += "You Lose.";
                        }
                            if (user == scissor && computer == paper) {
                                result += "You Win.";
                            }
                                if (user == scissor && computer == rock) {
                                    result += "You Lose.";
                                }
        System.out.println(result);
    }
}