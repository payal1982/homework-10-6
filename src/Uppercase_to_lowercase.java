//USER input is converted to lowercase
import java.util.Scanner;
public class Uppercase_to_lowercase
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet/string in uppercase" );
        String s1=sc.next();
        String s1_lowercase=s1.toLowerCase();
        System.out.println("The display in lower case is: "+s1_lowercase+" ");
        }
}
