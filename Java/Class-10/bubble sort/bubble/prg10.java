import java.util.Scanner;
public class prg10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[100];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        // Unsorted array
        System.out.println("Unsorted array");
        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j] + " ");
        }
        System.out.println();

        // Bubble sort first 50 in descending order
        for (int i = 0; i < 49; i++) {
            for (int j = 0; j < 49 - i; j++) {
                if (ar[j] < ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        System.out.println("First 50 sorted in descending order (bubble sort):");
        for (int k = 0; k < 50; k++) {
            System.out.print(ar[k] + " ");
        }
        System.out.println();

        // Selection sort next 50 in ascending order
        for (int i = 50; i < 99; i++) {
            int min = i;
            for (int j = i + 1; j < 100; j++) {
                if (ar[j] < ar[min]) {
                    min = j;
                }
            }
            int temp = ar[min];
            ar[min] = ar[i];
            ar[i] = temp;
        }
        System.out.println("Next 50 sorted in ascending order (selection sort):");
        for (int k = 50; k < 100; k++) {
            System.out.print(ar[k] + " ");
        }
        System.out.println();
    sc.close();
} 
}


