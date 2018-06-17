//use ternary operator to check whether user input is odd or even number
import java.util.Scanner;
public class odd_even_ternary_operator
{
    public static void main(String[] args)
    {
        int counter = 0 ;//variable to allow user to enter numbers.
        //done for reusability

        Scanner sc=new Scanner(System.in);
       do {
               System.out.println("Enter the number:");
               int a = sc.nextInt();

               int d = a % 2;
               String ans = (d == 0) ? ""+a+" is an even number" : ""+a+" is an odd number";//ternary operator syntax
               System.out.println(ans);
               counter ++;
           }
           while (  counter <= 1);
       }
    }


