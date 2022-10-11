import java.util.*;
public class Main {

	public static String diffasciiMohit(String Mohit)
	{
		StringBuilder sb=new StringBuilder("");
		sb.append(Mohit.charAt(0));
		for(int x=0;x<Mohit.length()-1;x++)
		{
			int res=-(int)(Mohit.charAt(x))+(int)(Mohit.charAt(x+1));
			sb.append(res);
			sb.append(Mohit.charAt(x+1));
		}
		return sb.toString();
	}
    public static void main(String args[]) 
	{
        // Your Code Here
		Scanner ms=new Scanner(System.in);
		String mohit=ms.next();
		System.out.println(diffasciiMohit(mohit));
    }
}
