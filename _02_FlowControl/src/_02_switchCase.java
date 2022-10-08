import java.util.Scanner;

public class _02_switchCase
{
    public static void main(String []args)
    {
        int x=0,y=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a character");
        String move = sc.next();
        switch(move)
        {
            case "L":
                x--;
                System.out.println(x+","+y);
                break;
            case "R":
                x++;
                System.out.println(x+","+y);
                break;
            case "U":
                y++;
                System.out.println(x+","+y);
                break;
            case "D":
                y--;
                System.out.println(x+","+y);
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
