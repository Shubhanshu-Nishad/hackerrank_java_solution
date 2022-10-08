import java.util.Scanner;

public class _17_Divisor
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
//        for (int i=1;i<=x;i++)
//        {
//            if(x%i==0)
//                System.out.println(i);
//        }
        int i;
        for (i=1;i*i<x;i++)
        {
            if(x%i==0)
                System.out.println(i);
        }
        for ( ;i>=1;i--)
        {
            if(x%i==0)
                System.out.println(x/i);
        }
    }
}
