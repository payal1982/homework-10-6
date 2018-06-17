//check whether the input from the user is a number, alphabet or symbol
import java.util.Scanner;

public class Number_alphabet_symbol
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);//object created for storing user input
        System.out.println("Please enter any alphabet/number/symbol:");
        String data=sc.next();
        char c=data.charAt(0);//first letter of user data is extracted
        if (Character.isDigit(c))//in-built class and method used for recognising digit
        {
            System.out.println("The data entered is a Digit.");
        }
        else if (Character.isAlphabetic(c))//in built method used for recognising alphabet
        {
            System.out.println("The data entered is an Alphabet");
        }
        else
        {
            System.out.println("The data entered is a Symbol.");
        }
    }
}
