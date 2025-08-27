import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter the 5 letters word: ");
        String words = input.nextLine();

        String reverse = "";

        reverse = "" + words.charAt(4) + words.charAt(3) + words.charAt(2) + words.charAt(1) + words.charAt(0);

        System.out.println("The reverse of the word " + words + " is " + reverse);
    }
}
