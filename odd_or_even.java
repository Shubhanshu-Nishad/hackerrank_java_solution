
import java.util.Scanner;
class odd_or_even {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a=in.nextInt();
        if(a%2==0)
        {
            System.out.println(a + " is an even number");
        }
        else
        {
            System.out.println(a + " is an odd number");
        }
        
    }
}
