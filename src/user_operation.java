//user enters numbers and operators and based on that operations need to be carried out

import java.util.Scanner;
public class user_operation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the operator:");
        String oper = sc.next();
        if (oper.equals("+"))
        {
            System.out.println("The sum of two numbers=" + (a+b));
        }
        else if (oper.equals("-"))
        {
            System.out.println("The difference of two numbers=" + (a-b));
        }
        else if (oper.equals("*"))
        {
            System.out.println("The product of two numbers=" + (a*b));
        }
        else if (oper.equals("/"))
        {
            System.out.println("The quotient of two numbers=" + (a/b));
        }
        else
        {
            System.out.println("Incorrect operator");
        }
    }
}
