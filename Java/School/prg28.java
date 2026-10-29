import java.util.*;
public class prg28
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a[] = str.split(" ");
        String most = "";
        int max = 0;
        for(int i = 0; i < a.length; i++)
        {
            int count = 0;            
            for(int j = 0; j < a.length; j++)
            {
                if(a[i].equals(a[j]))
                {
                    count++;
                }
            }
            if(count > max)
            {
                max = count;
                most = a[i];
            }
        }
        System.out.println("Most frequent word = " + most);
        System.out.println("Frequency = " + max);
    }
}