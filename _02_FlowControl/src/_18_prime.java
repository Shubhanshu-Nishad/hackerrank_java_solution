import java.util.Scanner;

public class _18_prime
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a positive Number");
        int n=sc.nextInt();
        int x=0;
        if(n==1)
            System.out.println("Not prime");
        for(int i=2;i<n;i++)
        {
            if(n%i==0) {
                System.out.println("not prime");
                x=1;
                break;
            }

        }
        if(x==0)
        {
            System.out.println("prime");
        }

    }

}
