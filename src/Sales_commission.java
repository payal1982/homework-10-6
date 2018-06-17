import java.util.Scanner;
//programme to calculate sales commission based on sales
//net salary done extra. it is not in the requirement
public class Sales_commission
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Seller ID:");
        int ID=sc.nextInt();
        System.out.print("Enter Seller Name:");
        String name=sc.next();
        System.out.print("Enter Basic Salary:");
        int Salary=sc.nextInt();
        System.out.print("Enter Sales Amount:");
        int sales=sc.nextInt();
        int commission;
        if (sales <10000)
        {
            commission= (sales*2)/100;
            System.out.println("Commission percentage=2%");
            System.out.println("Sales Commission= "+commission+" ");
            System.out.println("Net Salary=" +(Salary+commission));
        }

        else if (sales>=10000 && sales <20000)
        {
            commission= (sales*5)/100;
           System.out.println("Commission percentage=5%");
            System.out.println("Sales Commission= "+commission+" ");
            System.out.println("Net Salary=" +(Salary+commission));
        }
        else if (sales>=20000 && sales <30000)
        {
            commission= (sales*10)/100;
            System.out.println("Commission percentage=10%");
            System.out.println("Sales Commission= "+commission+" ");
            System.out.println("Net Salary=" +(Salary+commission));

        }
        else if (sales>=30000 && sales <50000)
        {
            commission= (sales*20)/100;
            System.out.println("Commission percentage=20%");
            System.out.println("Sales Commission= "+commission+" ");
            System.out.println("Net Salary=" +(Salary+commission));

        }
        else
        {
            commission= (sales*35)/100;
            System.out.println("Commission percentage=35%");
            System.out.println("Sales Commission= "+commission+" ");
            System.out.println("Net Salary=" +(Salary+commission));
        }



    }
}
