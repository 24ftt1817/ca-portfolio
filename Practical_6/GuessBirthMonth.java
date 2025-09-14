import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int monthNumber = 0;

        System.out.println("Is your birth month in Set 1 \n" + "1 3 5 7 9 11");
        System.out.print("Enter 0 for no and 1 for yes: ");
        int ans1 = input.nextInt();
        if (ans1 == 1) {
            monthNumber += 1;
        }

        System.out.println("\nIs your birth month in Set 2 \n" + "2 3 6 7 10 11");
        System.out.print("Enter 0 for no and 1 for yes: ");
        int ans2 = input.nextInt();
        if (ans2 == 1) {
            monthNumber += 2;
        }

        System.out.println("\nIs your birth month in Set 3 \n" + "4 5 6 7 12");
        System.out.print("Enter 0 for no and 1 for yes: ");
        int ans3 = input.nextInt();
        if (ans3 == 1) {
            monthNumber += 4;
        }

        System.out.println("\nIs your birth month in Set 4 \n" + "8 9 10 11 12");
        System.out.print("Enter 0 for no and 1 for yes: ");
        int ans4 = input.nextInt();
        if (ans4 == 1) {
            monthNumber += 8;
        }

        String month = "";
        switch (monthNumber) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
        }
        System.out.println("\nYou are born in " + month);
    }
}
