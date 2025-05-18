package binary_search;
import java.util.Scanner;
public class prg6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ar[] = new int[10];
        int search = 45;
        System.out.println("Enter 10 elements");
        for(int x = 0; x < 10; x++){
            Ar[x] = sc.nextInt();
        }
        // Sort array in ascending order (Bubble Sort)
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9 - i; j++){
                if(Ar[j] > Ar[j+1]){
                    int temp = Ar[j];
                    Ar[j] = Ar[j+1];
                    Ar[j+1] = temp;
                }
            }
        }
        // Print sorted array
        System.out.print("Sorted array: ");
        for(int i = 0; i < 10; i++){
            System.out.print(Ar[i] + " ");
        }
        System.out.println();
        // Binary search
        int low = 0;
        int high = 9;
        boolean found = false;
        while(low <= high){
            int mid = (low + high) / 2;
            if(Ar[mid] == search){
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if(Ar[mid] < search){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
