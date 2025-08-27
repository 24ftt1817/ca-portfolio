import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        new File("C:\\Practical 5").mkdir();

        FileWriter writer = new FileWriter("C:\\Practical 5/Modulus Questions.txt", true);

       int num1 = (int) (Math.random()*100);
       int num2 = (int) (Math.random()*100);

       writer.write(num1 + " % " + num2 + " = ?\r\n");
       System.out.println("A new question added ");
    
       writer.close();

       System.out.println("Running the program multiple times.");
    }
}
