import java.util.Scanner;
public class prg16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] Arr = new char[50];
        for (int i = 0; i < 50; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            Arr[i] = sc.next().charAt(0);
        }
        char[] Brr= new char[50];
        for (int i = 0; i < 50; i++) {
            Brr[i] = Arr[49 - i];
        }
        int vowelCount = 0;
        for (int i = 0; i < 50; i++) {
            char ch = Arr[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }   
        System.out.println("Vowel Count:"+ vowelCount); 
    }
}
