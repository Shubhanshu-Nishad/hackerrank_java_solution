import java.util.Scanner;

public class _05_calculator
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Slect an Operation\n 1.Addition\n 2.Subtraction\n 3.Multiplication");
        int oper=sc.nextInt();
        if(oper==1 || oper==2 || oper==3)
        {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            System.out.println("enter a second number");
            int b = sc.nextInt();
            if(oper==1)
                System.out.println("Answer = "+ a+b);
            else if (oper==2)
                System.out.println("Answer = "+ (a-b));
            else
                System.out.println("Answer = "+a*b);
        }
        else
            System.out.println("invalid");

    }
}
