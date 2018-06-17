//program to print odd and even numbers till a required number in different lines
public class OddEven_numbers
{

    public static void main(String[] args)
    {
        System.out.println("Even numbers between 1 to 70:");
        for (int a=2;a<70;a++)
        {
            if(a%2==0)
            {
               System.out.print(a + " ");
            }
        }
        System.out.println("\n Odd numbers between 1 to 70:");

        for (int a=2;a<=70;a++)
        {
            if (a % 2 != 0)
            {
                System.out.print(a + " ");
            }
        }
    }
}
