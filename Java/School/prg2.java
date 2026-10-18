public class prg2 {
    public static void main(String[] args) {
        int l=4;
        for(int i=1;i<=4;i++){      
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=l;j++) 
            {System.out.print("*");
                } l--;
            System.out.println();
        }
    }
    }