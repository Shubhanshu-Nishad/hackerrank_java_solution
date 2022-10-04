
import java.util.Scanner;
class max_of_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 3 Numbers: ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b & a>c)
        {
            System.out.println(a + " Is the Greatest Value");
        }
        else if(b>a & b>c)
        {
            System.out.println(b + " Is the Greatest Value");
        }
        else
        {
            System.out.println(c + " Is the Greatest Value");
        }
    }
}
