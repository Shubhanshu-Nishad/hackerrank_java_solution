
import java.util.Scanner;
class min_of_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 3 Numbers: ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a<b & a<c)
        {
            System.out.println(a + " Is the Smallest Value");
        }
        else if(b<a & b<c)
        {
            System.out.println(b + " Is the Smallest Value");
        }
        else
        {
            System.out.println(c + " Is the Smallest Value");
        }
    }
}
