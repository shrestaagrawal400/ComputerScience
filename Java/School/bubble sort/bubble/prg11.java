import java.util.Scanner;
public class prg11 { public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Age[] = new int[20];
        System.out.println("Enter the ages of 20 people");
        for (int i = 0; i < 20; i++) {
            Age[i] = sc.nextInt();
        }
        // Sort ages in ascending order
        for(int i=0; i<19; i++){
            for(int j=0; j<19-i; j++){
                if(Age[j] > Age[j+1]){
                    int temp = Age[j];
                    Age[j] = Age[j+1];
                    Age[j+1] = temp;
                }
            }
        }
        // Categorize and print
        System.out.println("Ages 1 to 20:");
        for(int i=0; i<20; i++){
            if(Age[i] >= 1 && Age[i] <= 20)
                System.out.print(Age[i] + " ");
        }
        System.out.println("\nAges 21 to 40:");
        for(int i=0; i<20; i++){
            if(Age[i] >= 21 && Age[i] <= 40)
                System.out.print(Age[i] + " ");
        }
        System.out.println("\nAges 41 to 60:");
        for(int i=0; i<20; i++){
            if(Age[i] >= 41 && Age[i] <= 60)
                System.out.print(Age[i] + " ");
        }
        System.out.println("\nAges 61 to 80:");
        for(int i=0; i<20; i++){
            if(Age[i] >= 61 && Age[i] <= 80)
                System.out.print(Age[i] + " ");
        }
        System.out.println("\nAges above 80:");
        for(int i=0; i<20; i++){
            if(Age[i] > 80)
                System.out.print(Age[i] + " ");
        }
        sc.close();
    }
}
