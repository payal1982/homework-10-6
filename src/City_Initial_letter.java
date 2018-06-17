//program where user can input alphabet from a-f and respective city name should be displayed
import java.util.Scanner;
public class City_Initial_letter
{

        public static void main(String []srgs)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter the alphabet from a-f for respective city name:");
            String ch1=sc.next();//variable to store user input
            String ch=ch1.toLowerCase();//if user input is uppercase, converts to lower case for better comparision

            if (ch.equals("a"))//method to compare string values
            {
                System.out.println("Ahmedabad");
            }
            else if (ch.equals("b"))
            {
                System.out.println("Banglore");
            }
            else if (ch.equals("c"))
            {
            System.out.println("Chennai");

            }
            else if (ch.equals("d"))
            {
            System.out.println("Delhi");

             }
            else if (ch.equals("e"))
            {
            System.out.println("Eluru");

             }
            else if (ch.equals("f"))
            {
            System.out.println("Faridabad");

            }
            else
            {
                System.out.println("Invalid entry-alphabet should be from a-f");
            }
        }

    }



