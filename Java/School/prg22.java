import java.util.*;

class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s, rev = "";
        System.out.print("Enter a string: ");
        s = sc.nextLine();

        //reversing the string
        for(int i = s.length() - 1; i >= 0; i--)
        {
            rev = rev + s.charAt(i);
        }

        //checking if the string is a palindrome
        if(s.equals(rev))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }

    }
}