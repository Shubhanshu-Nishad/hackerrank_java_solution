import java.util.Scanner;

public class _22_firstDigit
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(printFirst(x));
    }
    public static int printFirst(int x)
    {
//        while (x>10)
//        {
//            x=x/10;
//        }
//        return x;
        //Another Method
        double power= Math.log10(x);
        int p = (int) power;
        int a= (int) Math.pow(10,p);
        int ans= x/a;
        return ans;
    }
}
