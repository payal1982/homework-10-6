//program to check eligibility to vote based on user input
import java.util.Scanner;
public class Voting_Eligibility
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age:");
        double age=sc.nextDouble();
        if (age >125)
        {
            System.out.println("Please check your input");

        }
        else if (age <=125 && age>=18)
        {
            System.out.println("You are eligible to vote. Please use your vote responsibly.");

        }
        else
        {
            System.out.println("You are still a minor and are not eligible to vote");
        }
    }
}
