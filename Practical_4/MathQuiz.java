import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 101);
        int num2 = (int)(Math.random() * 101);

        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int sumAnswer = input.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + sumAnswer + " is " + (sumAnswer == (num1 + num2)));

        System.out.println("What is " + num1 + " % " + num2 + " ?");
        int modAnswer = input.nextInt();
        System.out.println(num1 + " % " + num2 + " = " + modAnswer + " is " + (modAnswer == (num1 % num2)));
    }
}
