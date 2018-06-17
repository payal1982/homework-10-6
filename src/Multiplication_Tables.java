//Program to show multiplication of a given integer till terms mentioned
import java.util.Scanner;
public class Multiplication_Tables
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the integer you want the tables for: ");
        int tab = sc.nextInt();
        System.out.print("Input the terms:");
        int terms=sc.nextInt();
        System.out.print("The tables is as:\n");
        int a=0;//for maintaining a count of terms
        do
            {
                int ans=a*tab;
                System.out.println(""+tab+" * "+a+" = "+ ans);
                a++;
            }
            while (a<=terms);
    }
}
