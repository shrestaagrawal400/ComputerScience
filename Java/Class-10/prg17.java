import java.util.Scanner;
public class prg17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Ar[]= new int[10];
    System.out.println("Enter 10 numbers to sort them in ascending order:");
    for(int i = 0; i<10; i++) {
        Ar[i]= sc.nextInt();
    }
System.out.println("The numbers in ascending order are:");
    //Bubble sort
    for(int i = 0; i<10; i++) {
        for (int j = 0; j < 10 - i - 1; j++) {
            if (Ar[j] > Ar[j + 1]) {
                int temp = Ar[j];
                Ar[j] = Ar[j + 1];
                Ar[j + 1] = temp;
            }
        }
    }
        for (int i=0; i<10; i++) {
        System.out.println(Ar[i]);
        }
    }
    }