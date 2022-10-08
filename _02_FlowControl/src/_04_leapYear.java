import java.util.Scanner;

public class _04_leapYear
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        if(x%4==0 && x%100!=0)
        {
            System.out.println("It is a leap Year");
        }
        else if (x%400==0)
        {
            System.out.println("It is a leap Year");
        }
        else
            System.out.println("It is not a leap year");
    }
}
