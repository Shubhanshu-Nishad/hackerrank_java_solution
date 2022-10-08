import java.util.Scanner;

public class _01_evenOddPositiveNegative
{
    public static void main(String  []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n<0)
        {
            if(n%2==0)
                System.out.println("Negative Even");
            else
                System.out.println("Negative Odd");
        }
        else
        {
            if(n%2==0)
                System.out.println("Positive Even");
            else
                System.out.println("Positive Odd");
        }
    }
}
