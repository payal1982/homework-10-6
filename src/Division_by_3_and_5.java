//to print numbers between 1-100 separately, which are divisible by 3 and 5
public class Division_by_3_and_5
{
    static void DivisibleBy3()//instance method
    {
        int a=1;//variable to initialize the multiplication
        int div3=1;//variable to set the boolean condition for max figure
        for ( a=1;div3<99;a++)
        {
            int multiples =a*3;//variable to store the multiplication ans, so that the div3 variable value can be increased
            System.out.print( multiples + " "  );
            div3=multiples;//value of multiples assigned to div3 to verify that the max value is reached

        }

    }
    static void DivisibleBy5()//instance method
    {
        int a=1;//variable to initialize the multiplication
        int div5=1;//variable to set the boolean condition for max figure
        for ( a=1;div5<95;a++)
        {
            int multiples =a*5;//variable to store the multiplication ans, so that the div5 variable value can be increased
            System.out.print( multiples + " "  );
            div5=multiples;//value of multiples assigned to div5 to verify that the max figure is reached

        }

    }
    public static void main(String [] args)//main method calling other methods
    {
        System.out.println("Numbers divisible by 3 are:");
        Division_by_3_and_5.DivisibleBy3();
        System.out.println("\nNumbers divisible by 5 are:");
        Division_by_3_and_5.DivisibleBy5();
    }
}
