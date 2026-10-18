import java.util.*;

class prg25
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s, word;
        int count = 0;

        s = sc.nextLine();
        word = sc.next();

        String a[] = s.split(" ");

        for(int i = 0; i < a.length; i++)
        {
            if(a[i].equals(word))
            {
                count++;
            }
        }

        System.out.println("Frequency = " + count);
    }
}