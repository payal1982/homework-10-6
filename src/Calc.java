//basic calculator functions
public class Calc {
    public void addition (int a, int b) // instance method
    {
        System.out.println("The result we get adding "+a+" and "+b+" = " + (a+b) );
    }

    static void subtraction(int a, int b) // static method
    {
        System.out.println("The result we get when subtracting "+a+" and "+b+" = " + (a-b));
    }
    void multiplication(int a, int b)// instance method
    {
        System.out.println("The product of "+a+" and "+b+" = " + (a*b));
    }

    static void division (int a, int b)//static method
    {
        System.out.println("The result we get when subtracting "+a+" and "+b+" = " + (a/b));
    }
    static void square (int a)//static method
    {
        System.out.println("The square of "+a+"  = " + (a*a));
    }

     static void cube (int a)//static method
    {
        System.out.println("The cube of "+a+"  = " + (a*a*a));
    }

    void percentage (double a, double b)//instance method
    {
        System.out.println("The Percentage of "+a+" from "+b+" = " + ((a/b)*100)+ "%");
    }
    public static void main (String[] args)//main method for calling other methods
    {
        Calc c= new Calc();//object declared for instance method
        c.addition (3,4);//method called via object
Calc.subtraction(3,9);// static method called by class name
        c.multiplication(2,5);//instance method called via object
        Calc.division(99,11);//class used to call static method
        Calc.square(5);//class used to call static method
        Calc.cube (2);//class used to call static method
        c.percentage(75 , 80);
    }
}
