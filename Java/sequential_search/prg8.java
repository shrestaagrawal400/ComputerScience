package sequential_search;
import java.util.Scanner;
public class prg8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in the array: ");
        int Ar[] = new int[10];
        for (int i = 0; i < Ar.length; i++) {
            Ar[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        int j;
        boolean found = false;
            // Check if the key is present in the array
        // If the key is found, set found to true
        for (j = 0; j < Ar.length; j++) {
            if (Ar[j] == key) {
                found = true;
                break;
            }}
            if(found) {
                System.out.println("Search successful");}
                else{
                System.out.println("Search failed");
        }
            sc.close();
    }
    }
        
            
