import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter 1 to convert bnd to rm and 2 vise versa: ");
        int choice = input.nextInt();

        System.out.print("Enter the amount to be converted: $");
        double amount = input.nextDouble();

        double convertedAmount = (choice == 1) ? amount * 3 : amount / 3;

        System.out.print("The change is $");
        System.out.printf("%.2f%n", convertedAmount);
    }
}
