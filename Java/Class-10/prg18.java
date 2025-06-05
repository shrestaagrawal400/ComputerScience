import java.util.Scanner;
public class prg18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Ar[] = new int[1];
        int search=2010;
        System.out.println("Enter the year of graduation:");
        for(int i=0; i<Ar.length; i++){
            Ar[i] = sc.nextInt();
        }
        boolean found = false;
        for(int i=0; i<Ar.length; i++) {
            if (Ar[i] == search) {
                found = true;
                break;
            }}
            if (found) {
                System.out.println("Record exists");}
                else{
                System.out.println("Record does not exist");
                    }

        }
    }