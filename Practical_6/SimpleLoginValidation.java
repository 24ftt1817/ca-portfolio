import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username =  "Ahmad Ali";
        String password = "12345";

        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Please enter your username:");
        String usernameInput = input.nextLine();

        System.out.println("Please enter the password:");
        String passwordInput = input.nextLine();

        if (usernameInput.equals(username) && passwordInput.equals(password)) {
            System.out.println("\nWelcome Ahmad Ali. The time now is " + now.format(formatter));
        }
            if (usernameInput.equals(username) && !passwordInput.equals(password)) {
                System.out.println("\nError: Password does not match.");
            }
                else if (!usernameInput.equals(username) && passwordInput.equals(password)) {
                    System.out.println("\nError: Invalid Username.");
                }
        }
    }