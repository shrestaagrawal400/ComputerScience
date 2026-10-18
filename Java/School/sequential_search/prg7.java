package sequential_search;
import java.util.Scanner;
public class prg7{
    public static void main(String[] args) {
        int Ar[] = new int[10];
        Scanner sc= new Scanner(System.in);
        for(int x = 0; x < 10; x++)
        {
            Ar[x]=sc.nextInt(); 
        }
        int search = 40;
        boolean found = false;
        for(int i = 0; i < 10; i++){
            if(Ar[i] == search){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
    
}
// This program takes 10 integers as input from the user and searches for the integer 40 in the array.
// If found, it prints the index of the element; otherwise, it prints "Element not found".