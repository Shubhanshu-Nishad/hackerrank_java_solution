import java.util.*;
public class Main {
	public static boolean isStringPalinMohit(String mohit)
	{
		int i=0;
		int j=mohit.length()-1;
		while(i<=j)
		{
			if(mohit.charAt(i)!=mohit.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner ms=new Scanner(System.in);
		String mohit=ms.next();
		System.out.println(isStringPalinMohit(mohit));
    }
}
