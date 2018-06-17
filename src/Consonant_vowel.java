//program where user inputs a character and the output should be consonant or vowel. and related error messages
import java.util.Scanner;//package imported
public class Consonant_vowel
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        String str=sc.next();//variable to store user input
        String str_upper=str.toUpperCase();//converts the input to upper case for better comparision
        char c=str.charAt(0);//checks the index of the string.index starts with 0
        int length=str.length();//variable to calculate the length of the string
        if (length>=2)//method checking the required condition of only 1 character allowed
        {
            System.out.println("Only 1 character input is required");//error message in case of more/less alphabets
        }
        else if (Character.isDigit(c))//in-built class and method used for recognising digit
        {
            System.out.println("No numbers allowed." );
        }
        else if (!Character.isDigit(c)&& !Character.isAlphabetic(c))//in-built class to verify that the character is not a special character
        {
            System.out.println("No Special Characters allowed.");
        }
        else if (str_upper.equals("A"))//checking for vowels
        {
            System.out.println("Entered character is a vowel.");
        }
        else if (str_upper.equals("E"))
        {
            System.out.println("Entered character is a vowel.");
        }
        else if (str_upper.equals("I"))
        {
            System.out.println("Entered character is a vowel.");
        }
        else if (str_upper.equals("O"))
        {
            System.out.println("Entered character is a vowel.");
        }
        else if (str_upper.equals("U"))
        {
            System.out.println("Entered character is a vowel.");
        }
        else//letters other than vowels will be consonants
        {
            System.out.println("Entered character is a consonant.");
        }



    }

}
