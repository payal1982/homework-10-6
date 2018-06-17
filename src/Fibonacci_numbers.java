//to print fibonacci numbers
public class Fibonacci_numbers
{
    public static void main(String[] args)
    {
        System.out.println("The sequence of Fibonacci numbers is:");
        int a=1;
        int b=1;
        System.out.print(a + " ");//prints first number in the series
        do
        {
            b+=a;//equivalent to b=b+a
            System.out.print(b + " ");
            a=b-a;//assigning new value to a, which is the previous value of b, before the addition
            //addition facts used here


        }
        while ( b<=13);//value set 1 step back, as the operation is done before the checking of the value
    }
}
