import java.util.Scanner;

public class _19_StairOrFabonacii
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        if(x==0)
            System.out.println("1");
        else if (x==1)
        {
            System.out.print(1+" ");
            System.out.print(1);
        }
        else
        {
            System.out.print(1+" ");
            System.out.print(1+" ");
            int a=1;
            int b=1;
            for(int i=2;i<x;i++)
            {
               int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
