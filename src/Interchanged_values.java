//program to print interchanged values of 2 numbers based on user input
//also we can use 3rd variable to store the value of 1st number and interchange the values between them
// like c=a,a=b and then b=c
import java.util.Scanner;

public class Interchanged_values
{

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter 1st number:");//user prompted to enter 1st number
    int num1=sc.nextInt();
    System.out.println("Please enter 2nd number:");//user prompted to enter 2nd number
    int num2=sc.nextInt();
   System.out.println("Before interchanging the values First number is "+num1+" and Second number is "+num2+" ");
    num1=num1+num2;//addition & subtraction facts
    num2=num1-num2;
    num1=num1-num2;

System.out.println("After interchanging the values First number is "+num1+" and Second number is "+num2+" ");
}
}
