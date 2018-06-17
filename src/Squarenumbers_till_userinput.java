//all the square numbers till the user input should be printed
import java.util.Scanner;
public class Squarenumbers_till_userinput
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to which you want to see all the square numbers:");
        int num=sc.nextInt();

        int Square=1;
        int a=1;
        while (Square<num)
        {
            int Square1=a*a;//square calculated
            System.out.print(Square1 + " ");
            Square=Square1;//value of square assigned to the variable for comparing the max condition
            a++;//value of variable increased after use
            --num;
        }

    }
}
