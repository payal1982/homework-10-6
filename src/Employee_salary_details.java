//program to calculate employees salary based on the details entered
import java.util.Scanner;//package imported
public class Employee_salary_details//main class
{
    public static void main(String[]args)// main method
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter Employee Id: ");
        int Id=sc.nextInt();
        System.out.print("Enter Employee Name:");
        String Name=sc.next();
        System.out.println("Enter Basic salary:");
        double salary=sc.nextDouble();
        double salary_roundoff = (double) Math.round( salary * 100) / 100;//rounding salary to 2 decimal point.
        // If required can omit here
        double HRA= (salary_roundoff*10)/100;
        double HRA_roundoff = (double) Math.round( HRA * 100) / 100;//rounding HRA to 2 decimal point,
        // necessary since % goes to more decimal places
        double DA=(salary*8)/100;
        double DA_roundoff = (double) Math.round( DA * 100) / 100;//rounding DA to 2 decimal point
        double TA=(salary*9)/100;
        double TA_roundoff = (double) Math.round( TA * 100) / 100;//rounding TA to 2 decimal point
        double PF=(salary*20)/100;
        double PF_roundoff = (double) Math.round( PF * 100) / 100;//rounding PF to 2 decimal point
        double Gross_sal= (salary_roundoff+HRA_roundoff+DA_roundoff+TA_roundoff)-PF_roundoff;//Gross salary calculation
        double Gross_sal_roundoff = (double) Math.round( Gross_sal * 100) / 100;//rounding Gross salary to 2 decimal point
        System.out.println(" HRA(Rs.)\t\t\t DA(Rs.)\t\t\t\t TA(Rs.)\t\t\t\tPF(Rs.)\t\t\t\tGross Salary(Rs.)");
        //if required can do in single lines, tried the escape sequence here
        System.out.println(""+HRA_roundoff+"\t\t "+DA_roundoff+"\t\t "+TA_roundoff+"\t\t "+PF_roundoff+" \t\t\t "+Gross_sal_roundoff+"");
    }
}
