import java.util.Scanner;

public class _12_pattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int j=0;
            while(j<x)
            {
                System.out.print("*");
                j++;
            }
            System.out.println("");
        }
    }
}
