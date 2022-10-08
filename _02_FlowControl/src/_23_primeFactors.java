import java.util.Scanner;

public class _23_primeFactors
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(primeFactors(n));

    }
    public static int primeFactors(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(isPrime(i))
            {
                int x=i;
                while (n%x==0)
                {
                    System.out.println(i);
                    x=x*i;
                }
            }

        }

        return n;
    }
    public static boolean isPrime(int n)
    {
        for (int i=2; i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

}
