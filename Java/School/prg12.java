import java.util.Scanner;
public class prg12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[3];
        int i=0;
        System.out.println("Enter 3 numbers");
        for (int idx = 0; idx < arr.length; idx++) {
        arr[idx] = sc.nextInt();
            }
            int sum = 0;
            for (int idx = 0; idx < arr.length; idx++) {
                sum += arr[idx];
            }
            System.out.print("Sum of arr " + sum);
            sc.close();
        }
    }