import java.util.Scanner;

public class _01_negativePositive
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if (x<0)
        {
            System.out.println("Invalid no");
        }
        else
        {
            int y=0;
            for( int i=0; i<=x; i++)
            {
                y=y+i;
            }
            System.out.println(y);
        }
    }
}
