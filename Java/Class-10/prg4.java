import java.util.Scanner;
public class prg4{
    public static void main(String args[]){
        // Program to count the number of A's, B's, C's and D's in a given array
        Scanner sc=new Scanner(System.in);
        int i,j,A,B,C,D;
        char Gr[]=new char[10];
        System.out.println("Give Grades from A to D:");
        for(i=0;i<10;i++){
            Gr[i]=sc.next().charAt(0);
        }
        A=B=C=D=0;
        for(j=0;j<10;j++){
            if(Gr[j]=='A'){
                A++;
            }
            else if(Gr[j]=='B'){
                B++;
            }
            else if(Gr[j]=='C'){
                C++;
            }
            else if(Gr[j]=='D'){
                D++;
            }
        }
        System.out.println("No of A's: "+A);
        System.out.println("No of B's: "+B);
        System.out.println("No of C's: "+C);
        System.out.println("No of D's: "+D);

    }
}