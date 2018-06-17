//program to prepare student marksheet.Passing based on individual subject
import java.util.Scanner;
public class student_marksheet_individual_subject_markss
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Student Name:");
       String name= sc.next();//variable to store name
       System.out.println(" Enter Surname");
       String surname = sc.next();
       System.out.print("Enter student roll number:");
       int rollno = sc.nextInt();
       System.out.print("Enter English Marks:");
       double eng = sc.nextDouble();
       System.out.print("Enter Maths Marks:");
       double maths = sc.nextDouble();
       System.out.print("Enter Science Marks:");
       double science = sc.nextDouble();
       double Total_Marks = eng + maths + science ;// variable for calculating total marks
       double Total_roundoff = (double) Math.round( Total_Marks * 100) / 100;//rounding total marks to 2 decimal point
       if ( eng<35 || maths<35 || science<35)//checking whether student has passed in all subjects
       {
           System.out.println("Student Name \t Surname" ); //printing in marksheet format
           System.out.println(" " + name + " \t\t\t " + surname + " " );
           System.out.println("Fail: Minimum passing marks required in all subjects");
       }
       else
       {

       System.out.println("Total marks =" + Total_roundoff);
              double average = Total_Marks / 3;//variable for storing average marks
        if (Total_roundoff > 300)
        //verify if incorrect marks entered. ie marks received higher than 100 per subject
        {
           System.out.println("Please start again, marks received more than the total marks.");
       } else//printing in marksheet format
           {
           double average_roundoff = (double) Math.round(average * 100) / 100;//rounding average marks to 2 decimal point
           System.out.println("Average Marks =" + average_roundoff);
           double percent = (Total_Marks / 300) * 100;//calculating percentage
           double percent_roundoff = (double) Math.round(percent * 100) / 100;//rounding total marks to 2 decimal point
           System.out.println("Percentage obtained = " + percent_roundoff + "%");
           System.out.println("Student Name \t Surname \t Total Marks \t Average marks \t Percentage ");//printing in marksheet format
           System.out.println(" " + name + " \t\t\t " + surname + " \t\t " + Total_roundoff + " \t\t\t " + average_roundoff + " \t\t\t " + percent_roundoff + " ");
            //printing grades based on total marks
           if (percent_roundoff >= 35 && percent_roundoff < 50)
           {
               System.out.println("Pass\n Grade Received = C");
           } else if (percent_roundoff >= 50 && percent_roundoff < 60)
           {
               System.out.println("Grade Received=B");
           } else if (percent_roundoff >= 60 && percent_roundoff < 80)
           {
               System.out.println("Grade Received=A");
           } else
               System.out.println("Grade Received=A+");

       }
   }
}

   }

