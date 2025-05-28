import java.util.Scanner;
public class prg14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] Mks = new float[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter height of student " + (i + 1) + ": ");
            Mks[i] = sc.nextFloat();
        }
        int x=0;
        for (int i = 0; i < 20; i++) {
            if (Mks[i] >= 5.0)
            {
                x++;
            }
        }
        System.out.println("Number of students with  minimum height of 5.0 feet: " + x);
    }
}
