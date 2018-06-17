//user inputs number and based on that the system outputs the day of the week
//we have considered that week begins from Sunday
import java.util.Scanner;

public class Day_of_week
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of the week:");
        int number=sc.nextInt();
        if (number==1)
        {
            System.out.println("1st day of the week is Sunday");
        }
        else if (number==2)
        {
            System.out.println("2nd day of the week is Monday");
        }
        else if (number==3)
        {
            System.out.println("3rd day of the week is Tuesday");
        }
        else if (number==4)
        {
            System.out.println("4th day of the week is Wednesday");
        }
        else if (number==5)
        {
            System.out.println("5th day of the week is Thursday");
        }
        else if (number==6)
        {
            System.out.println("6th day of the week is Friday");
        }
        else if (number==7)
        {
            System.out.println("7th day of the week is Saturday");
        }
        else
        {
            System.out.println("Invalid entry. Days of the week can be from 1-7");
        }
    }
}
