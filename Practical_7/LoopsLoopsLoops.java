public class LoopsLoopsLoops {
    public static void main(String[] args) {
       int no = 0; 
       System.out.println("\nBelow is generated using while loop:");
        while (no < 20) {
            no++;
            System.out.print(no + " ");
        }

        System.out.println("\nBelow is generated using dowhile loop:");
        int start = 50;
        do {
            System.out.print(start+" ");
            start--;
        } while (start >=35);

        System.out.println("\nBelow is generated using for loop:");
        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.print(i+" ");
        }
    }
}
