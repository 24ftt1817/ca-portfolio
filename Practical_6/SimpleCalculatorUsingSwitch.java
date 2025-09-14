import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression: ");
        int num1 = input.nextInt();
        String operator = input.next();
        int num2 = input.nextInt();

        int result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("The sum is " + result);
                break;
            
            case "-":
                result = num1 - num2;
                System.out.println("The subtraction is " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("The multiplication is " + result);
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Math error: The divisor cannot be Zero");
                }
                else {
                result = num1 / num2;
                System.out.println("The division is " + result);
                }
                break;
        }
    }
}
