import java.util.*;
public class Main {

	public static String removeduplicatemohit(String mohit)
	{
		String str="";
		for(int x=0;x<mohit.length()-1;x++)
		{
			if(mohit.charAt(x)!=mohit.charAt(x+1))
				str+=mohit.charAt(x);
		}


				str+=mohit.charAt(mohit.length()-1);
			
		return str;
	}
    public static void main(String args[]) {
        // Your Code Here

		Scanner ms=new Scanner(System.in);
		String mohit=ms.next();
		System.out.println(removeduplicatemohit(mohit));
    }
}
