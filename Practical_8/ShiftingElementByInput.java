import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are there?: ");
        int num = input.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the " + num + " numbers:");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter number of left shift: ");
        int shift = input.nextInt();

        for (int s = 0; s < shift; s++) {
            int first = arr[0]; 
            for (int i = 0; i < num - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[num - 1] = first; 
        }

        System.out.println("The shifted arrangement is:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
