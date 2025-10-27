import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 900) + 100;

        System.out.print("Enter the reverse of " + number + ": ");
        int userInput = input.nextInt();

        int reversedNumber = reverse(number);

        boolean isPalindrome = isPalindrome(userInput, reversedNumber);

        System.out.println("The digit " + userInput + " is palindrome of " + number + " is " + isPalindrome + ".");

    }
     public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int userInput, int reversed) {
        return userInput == reversed;
    }
}
