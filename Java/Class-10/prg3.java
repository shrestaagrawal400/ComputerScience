class main{
    public static void main(String[] args) {
int ii=0;
int yy=4;
int zz=3;
        for(int i=0; i<5; i++){

            for(int j=ii;j>=1;j--){
                System.out.print(" ");
            }
            ii++;
            System.out.print("*");
            for(int y=yy;y>=1;y--){
                System.out.print(" ");
            }
            yy--;
            for(int z=zz;z>=1;z--){
                System.out.print(" ");
            }
            zz--;
            System.out.println("*");
    }
}
}
/* Output:
*       *
*     *
 *   *
  * *
   **
     */