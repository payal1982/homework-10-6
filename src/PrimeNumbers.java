//program to print first 100 or n prime numbers
//had to take help from other online program to understand the logic
import java.util.Scanner;//package imported to allow user input
public class PrimeNumbers
{
    public static void main( String[]args)
    {
        Scanner sc=new Scanner(System.in);//variable declared for scanner class
        System.out.println("Please enter the number you want to print the prime numbers upto(max=100)");
        int num=sc.nextInt();
        int primenum, i, count;/*variables declared for later initialisation
         primenum is the number for which we are checking whether it is prime number or not. in our case all the numbers
         till the user input or 100(which ever first will be checked*/
        System.out.println("The prime numbers in the mentioned range are:");
        for ( primenum=1;primenum<=num&&primenum<100;primenum++)//initialises the value of first prime number
            //and sets the condition till the maximum number or user input
        {
            count=0;//sets counter to check that number is divisible by how many other numbers
            for (i=2;i<=primenum/2;i++)//checks whether the given number is divisible by all numbers less than itself
            {
                if( primenum%i==0)//if number is divisible by any other number
                {
                    count++;//counter increased
                    break;//loop stops once the number can be divided by any other number
                }
            }
            if (count==0)//
            {
                System.out.print(primenum + " ");
            }

        }


    }
}
