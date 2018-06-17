//calc functions based on user input numbers
import java.util.Scanner;//package for I/O imported

public class Calc_user_input //main class
{

    public static void main(String[] args)//main method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter the two numbers you want to add:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println( "The result = " + (a+b));
        System.out.println( "Enter the two numbers you want to subtract:");
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println( "The result = " + (c-d));
        System.out.println( "Enter the two numbers you want to multiply:");
        int e=sc.nextInt();
        int f=sc.nextInt();
        System.out.println( "The result = " + (e*f));
        System.out.println( "Enter the two numbers you want to divide:");
        int g=sc.nextInt();
        int h=sc.nextInt();
        System.out.println( "The result = " + (g/h));
         System.out.println( "Enter the number you want to square:");
        int i=sc.nextInt();
         System.out.println( "The result = " + (i*i));
        System.out.println( "Enter the numbers you want to cube:");
        int j=sc.nextInt();
        System.out.println( "The result = " + (j*j*j));
    }
}
