//user inputs 5 numbers and find average of the numbers
import java.util.Scanner;//allows user input
public class Average//main class
{
    public static void main (String[]args)//main method calls another methods
    {
        Scanner sc=new Scanner(System.in);
        int a=0;//count for the numbers of integers entered
        int sum=0;//extra out of requirement

        do
            {
                System.out.println("Enter the number:");//prompts user to enter name
                int num1=sc.nextInt();
                sum=sum+num1;//adds the values of each number entered to the previous value
                a++;//manages count for number of integers to be entered
             }
             while (a<5);//limiting user input to 5 numbers

        System.out.println("Sum of the above numbers = "+sum+"");

        int avg=sum/5;
        System.out.println("The average of above numbers is "+avg+"");
    }
}
