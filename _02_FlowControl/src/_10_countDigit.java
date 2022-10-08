import java.util.Scanner;

public class _10_countDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int count =0;
        while(x>0)
        {
            x=x/10;
            count++;

        }
        System.out.println(count);
    }
}
