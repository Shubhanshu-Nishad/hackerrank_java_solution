import java.util.Scanner;

public class _16_lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max= a*b;
        int x=Math.max(a,b);
        int ans=x;
        for(int i=x;i<=max;i++)
        {
            if(i%a==0 && i%b==0) {
                ans = i;
                break;
            }

        }
        System.out.println(ans);
    }
}
