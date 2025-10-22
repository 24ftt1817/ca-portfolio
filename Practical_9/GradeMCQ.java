import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char[][] answers = {
            {'A', 'B', 'C', 'D', 'A', 'B'}, 
            {'C', 'D', 'D', 'A', 'B', 'D'}, 
            {'D', 'D', 'A', 'B', 'B', 'A'}, 
            {'C', 'A', 'D', 'A', 'B', 'C'}  
        };

        System.out.println("Enter the key to the MCQ:");
        char[] key = new char[6];
        for (int i = 0; i < key.length; i++) {
            key[i] = input.next().toUpperCase().charAt(0);
        }
        
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }
            String result = (correctCount >= 3) ? "passed" : "failed";
            System.out.printf("Student %d's correct count is %d. Therefore, he/she %s the test.%n", i, correctCount, result);
            correctCount = 0;
        }
    }
}