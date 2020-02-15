import java.io.*;
import java.util.Scanner;

class Calc
{
    int n1, n2,ch;
   public Calc()
   {
        n1=n2=ch=0;
   }
   public void read_data()
   {
	Scanner s = new Scanner(System.in);
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	System.out.println("Enter your choice: ");
	ch = s.nextInt();
	System.out.println("Enter two numbers: ");
	n1 = s.nextInt();
	n2 = s.nextInt();
   }
   public void calculate()
   {
	switch(ch)
	{
	   case 1: System.out.println("Addition is "+(n1+n2)); break;
	   case 2: System.out.println("Subtraction is "+(n1-n2)); break;
	   case 3: System.out.println("Multiplication is "+(n1*n2)); break;
	   case 4: System.out.println("Division is "+((double)n1/n2)); break;
	   default: System.out.println("Invalid option, Try again ...");
	}
   }
}

public class MyCalculator
{
    public static void main(String args[])
    {
	Calc ob = new Calc();
	ob.read_data();
	ob.calculate();
    }
}