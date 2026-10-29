import java.io.*;
import java.util.*;
class prg19
{
public static void main(String args []) throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(isr);
String sent;
Scanner sc = new Scanner(System.in);
FileWriter fw = new FileWriter("Data.txt");
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter pw = new PrintWriter(bw);
System.out.println("Enter total number of sentences you want to store");
int N = sc.nextInt(); //input through Scanner
for(int i = 1; i <= N ; i++)
{
 System.out.println("Enter sentence:");
 sent = br.readLine(); //input through ISR
 pw.println(sent);
}
pw.close();
bw.close();
fw.close(); {
    
}
}
}
