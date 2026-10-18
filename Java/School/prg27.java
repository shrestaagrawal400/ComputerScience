import java.util.*;
public class prg27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String longest = "";String a[] = str.split(" ");
        for(int i=0; i<a.length; i++) {
            if(a[i].length() > longest.length()) {
                longest = a[i];
            }
        }
        System.out.println(longest);
    }
}
