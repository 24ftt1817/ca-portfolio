import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int term0 = 0;
        int term1 = 1;
        int fib = 0;
        int n;

        System.out.print("Please enter the term: ");
        n = input.nextInt();

        if (n == 0) {
            System.out.println("At term "+n+" the number is "+term0);
        }
        else if (n == 1) {
            System.out.println("At term "+n+" the number is "+term1);
        }
        else{
            for (int i = 1; i < n; i++) {
                fib = term0 + term1;
                term0 = term1;
                term1 = fib;
            }
            System.out.println("At term "+n+" the number is "+ fib);
        }
    }
}
