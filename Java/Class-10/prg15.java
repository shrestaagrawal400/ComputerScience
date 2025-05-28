import java.util.Scanner;
public class prg15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] Price = new double[15];
        System.out.println("Enter the price of 15 items:");
        for (int i = 0; i < 15; i++) {
            Price[i] = sc.nextDouble();
        }
        // Bubble sort in descending order
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14 - i; j++) {
                if (Price[j] < Price[j + 1]) { // Changed > to <
                    double temp = Price[j];
                    Price[j] = Price[j + 1];
                    Price[j + 1] = temp;
                }
            }
        }
        // Print the first 3 (largest) prices
        System.out.println("The 3 highest prices are:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Price of item :" + Price[i]);
        }
    }
}
