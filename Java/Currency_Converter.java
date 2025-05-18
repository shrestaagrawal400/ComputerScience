import java.util.*;
class Currency_Converter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in USD: ");
        double usd = sc.nextDouble();
        double inr = usd * 74.85;
        System.out.println("Amount in INR: " + inr);
    }
}