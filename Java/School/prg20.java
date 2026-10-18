import java.io.*;
class prg20
{
public static void main(String args []) throws IOException
{
//InputStreamReader isr = new InputStreamReader(System.in);
//BufferedReader br =new BufferedReader(isr);
String sent;
FileReader frr = new FileReader("Data.txt");
BufferedReader br = new BufferedReader(frr);
while((sent = br.readLine()) != null)
{
 System.out.println(sent);
}
br.close();
frr.close();
System.out.println("File Read Successfully");
}
}