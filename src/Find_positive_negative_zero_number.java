//program to check +ve,_ve or 0 number based on user input
import java.util.Scanner;

public class Find_positive_negative_zero_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input data");
        int a=sc.nextInt();
        if (a==0)
        {
            System.out.println("The number is Zero");
        }
        else if (a>0)
        {
            System.out.println(" The number is positive number");
        }
        else if (a<0)
        {
            System.out.println("The number is negative number");
        }
        else
        {
            System.out.println("Invalid datatype");
        }
    }
}
