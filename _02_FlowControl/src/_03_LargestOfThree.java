import java.util.Scanner;

public class _03_LargestOfThree
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number");
        int a = sc.nextInt();
        System.out.println("enter a Second Number");
        int b = sc.nextInt();
        System.out.println("Enter a Third Number");
        int c = sc.nextInt();
        int x = Math.max(a,b);
        int y = Math.max(x,c);
        System.out.println(y);

//        if(a>=b && a>c) {
//            System.out.println("A is a greater Numbers");
//        }
//        else if (b>=a && b>c)
//        {
//            System.out.println("B is a greater Numbers");
//        }
//        else
//        {
//            System.out.println("C is a greater Numbers");
//        }

    }
}
