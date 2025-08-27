import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        name.toUpperCase();
        
        FileWriter writer = new FileWriter("C:\\Practical 5/QReceipt.txt");

        int num = (int) (Math.random()*100);
        LocalDateTime myObjDT = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = myObjDT.format(myFormatObj);
        writer.write(formattedDate + "\n\n" + "Hi, " + name + 
        "\n" + "\nYour Queue No is : " + num);

        writer.close();

        System.out.println("Receipt generated. Thank you.");
    }
}