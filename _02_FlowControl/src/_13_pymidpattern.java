import java.util.Scanner;

public class _13_pymidpattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=x-i;j++)
            {
                System.out.print(" ");
            }
            int k=1;
            for (k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
