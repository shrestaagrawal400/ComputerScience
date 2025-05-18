import java.util.Scanner;
public class prg9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the names of 10 people:");
    String[] Names = new String[10];
    for (int i = 0; i < Names.length; i++) {
        Names[i] = sc.nextLine();
    }
    //names in alphabetical order
    for (int i = 0; i < Names.length; i++) {
        for (int j = i + 1; j < Names.length; j++) {
            if (Names[i].compareTo(Names[j]) > 0) {
                String temp = Names[i];
                Names[i] = Names[j];
                Names[j] = temp;
            }
        }
    }
    System.out.println("Enter the mobile numbers of 10 people:");
    int Numbers[]= new int[10];
    for (int i = 0; i < Numbers.length; i++) {
        Numbers[i] = sc.nextInt();
    }
    //numbers in ascending order
    for (int i = 0; i < Numbers.length; i++) {
        for (int j = i + 1; j < Numbers.length; j++) {
            if (Numbers[i] > Numbers[j]) {
                int temp = Numbers[i];
                Numbers[i] = Numbers[j];
                Numbers[j] = temp;
            }
        }
    }
    //displaying names and numbers
    System.out.println("Names and numbers in alphabetical order:");
    for (int i = 0; i < Names.length; i++) {
        System.out.println(Names[i] + " " + Numbers[i]);
    }
    
    
}    
}
