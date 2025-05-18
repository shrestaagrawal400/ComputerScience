import java.util.Scanner;
public class prg5 {
    public static void main(String[] args) {
        // Program to sort an array in descending order
        // using bubble sort
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int Ar[] = new int[5];
        for(int x=0;x<5;x++){
        Ar[x]=sc.nextInt();
        }

       
        System.out.println("Array before sorting:");
        for (int a = 0; a < 5; a++) {
            System.out.print(Ar[a] + " ");}
            
        
        int temp;
        for(int i=4;i>=1;i--){
            for(int j=0;j<i;j++){
         if(Ar[j]<Ar[j+1]){
            temp=Ar[j];
            Ar[j]=Ar[j+1];
            Ar[j+1]=temp;
                }
            }
        }
        //Arrays after sorting
        System.out.println("Array after sorting:");
        for (int o = 0; o < 5; o++) {
            System.out.print(Ar[o] + " ");}
        System.out.println();

            }
        }
        