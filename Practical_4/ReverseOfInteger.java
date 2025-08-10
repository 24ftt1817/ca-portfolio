import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int num = input.nextInt();

        int digit1 = num / 100;         // first digit
        int digit2 = (num / 10) % 10;  // middle digit
        int digit3 = num % 10;        // last digit
        
        System.out.print("The reverse of " + num + " is ");
        System.out.printf("%3$s%2$s%1$s", digit1 , digit2, digit3);
    }
}
