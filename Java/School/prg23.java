import java.util.*;
class prg23
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int vowelCount = 0;
    int consonantCount = 0;
    int DigitCount = 0;
    int SpaceCount = 0;
    int SpecialCount = 0;
    for (int i = 0; i < s.length(); i++)
    {
      char ch = Character.toLowerCase(s.charAt(i));
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
      { 
        vowelCount++;
      }
      else
      {
        if (Character.isDigit(ch))
          {
            DigitCount++;
          }
        else if (Character.isWhitespace(ch))
          {
            SpaceCount++;
          }
        else if (Character.isLetter(ch))
          {
            consonantCount++;
          }
        else
          {
            SpecialCount++;
          }
      }
    }
    System.out.println("Vowel Count: " + vowelCount);
    System.out.println("Consonant Count: " + consonantCount);
    System.out.println("Digit Count: " + DigitCount);
    System.out.println("Space Count: " + SpaceCount);
    System.out.println("Special Character Count: " + SpecialCount);
  }

}