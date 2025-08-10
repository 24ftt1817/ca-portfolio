import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("What is your target amount? $");
        Double targetAmount = input.nextDouble();

        System.out.print("How many month(s) to reach your goal? ");
        Double monthsGoal = input.nextDouble();

        double savePerDay = (targetAmount / monthsGoal) / 30;

        System.out.print("The amount you need to save per day is $");
        System.out.printf("%.2f%n",savePerDay);
    }
}
