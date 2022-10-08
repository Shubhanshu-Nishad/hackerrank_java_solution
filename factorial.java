import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
      System.out.print("Enter a Number: ");
    
     int a=in.nextInt();
     int fact=1;
     for(int i=1;i<=a;i++)
     {
         fact=fact*i;
     }
     System.out.println("Factorial: "+fact);
    }
}
