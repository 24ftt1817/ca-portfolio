public class ProductRating {
    public static void main(String[] args) {
         
    int[][] feedback = {
            {4, 5, 4},  // Customer 1
            {3, 5, 3},  // Customer 2
            {4, 5, 3},  // Customer 3
            {1, 2, 1}   // Customer 4
        };

    System.out.println("Rating\tProduct\tPackaging\tDelivery");

    double[] avg = new double[3]; // 3 columns
        for (int col = 0; col < 3; col++) {
            int sum = 0;
            for (int row = 0; row < feedback.length; row++) {
                sum += feedback[row][col];
            }
            avg[col] = (double) sum / feedback.length;
        }

    System.out.print("Average\t");
        for (int i = 0; i < avg.length; i++) {
            System.out.printf("%.2f\t", avg[i]);
        }
        System.out.println("");
    for (int row = 0; row < feedback.length; row++) {
            int sum = 0;
            for (int col = 0; col < 3; col++) {
                sum += feedback[row][col];
            }
            double avgCustomer = (double) sum / 3;
            System.out.printf("Customer %d provide the average rating %.2f%n", row + 1, avgCustomer);
        }
    }
}
