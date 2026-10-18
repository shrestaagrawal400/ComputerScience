import java.util.*;
class prg24
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char ch=sc.next().charAt(0);
    int count=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==ch)
      {
        count++;
      }
    }
    System.out.println("Count of '" + ch + "': " + count);
  }
}