import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Each durian cost $15.75");
        System.out.print("How much money do you have? $");
        Double money = input.nextDouble();

        double durianPrice = 15.75;
        int NumberOfDurians =(int) (money / durianPrice);

        System.out.println("The number of durian(s) you can buy is " + NumberOfDurians); 
    }
}
