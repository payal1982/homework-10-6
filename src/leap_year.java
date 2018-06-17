//program where user inputs the year and based on that, output is whether year is a leap year or not
import java.util.Scanner;

public class leap_year
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year in 4 digit-");
        int a = sc.nextInt();
        int c = a % 4;//variable to store value of the division by 4
        int d= a % 100;//variable to store value for division by 100
        int e= a%400;//variable to store value for division by 400

        if (c != 0)
        {
            System.out.println(" Year " + a + " is not a Leap year.");
        }
            else

        {
            if (d==0)
            {
                if (e==0)
                {
                    System.out.println("Year " + a + " is a Leap Year.");
                }
                else
                    {
                        System.out.println(" Year " + a + " is not a Leap year.");
                    }


            }
        }

        }
    }
