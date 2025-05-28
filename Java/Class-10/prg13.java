import java.util.Scanner;
public class prg13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double[] Mks= new double[10];
        for(int i=0; i<10; i++){
            System.out.print("Enter marks of student : ");
            Mks[i] = sc.nextDouble();
        }
        double max = Mks[0];
        double min = Mks[0];
        double sum = 0;
        for(int i=0; i<10; i++){
            if(Mks[i] > max){
                max = Mks[i];
            }
            if(Mks[i] < min){
                min = Mks[i];
            }
            sum += Mks[i];
        }
        System.out.println("Maximum marks: " + max);
        System.out.println("Minimum marks: " + min);
    }
}
