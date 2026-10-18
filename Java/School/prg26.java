import java.util.*;
public class prg26 {
    void main(){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String a[] = s.split(" ");
    int count = 0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i].length()>5)
        {
            count++;
        }
        System.out.println("Number of words with more than 5 characters = " + count);
    }
}
}