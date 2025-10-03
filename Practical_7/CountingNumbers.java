import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = 0;
        int positive = 0;
        int negative = 0;
        int count = 0;
        int total = 0;
        double average = 0;

        System.out.println("Enter an integer, the input ends if it is 0:");
        
        while (true) {
            integer = input.nextInt();
            if (integer == 0) {
                break;
            }

            if (integer > 0) {
                positive++;
            }
            else if (integer < 0) {
                negative++;
            }
            total += integer;
            count++;
        }
        if (count == 0) {
            System.out.println("No number is entered except for 0 to end the program.");
        } 
        else {
            average = (double) total / count;
            System.out.println("The number of positive is " + positive);
            System.out.println("The number of negative is " + negative);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f%n", average);
        }
        }
    }

