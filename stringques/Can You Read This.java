import java.util.*;
public class Main {

	public static void CamelMohit(String mohit)
	{
		StringBuilder str=new StringBuilder("");
		int z=0;
		for(int x=0;x<mohit.length();x++)
		{
				str.append(mohit.charAt(x));
					if(x<mohit.length()-1 && mohit.charAt(x+1)>='A' && mohit.charAt(x+1) <='Z')
					{
						System.out.println(str);
						str.setLength(0);
						z=x;
						continue;
					}
				}
				for(int y=z+1; y<mohit.length();y++)
				
					System.out.print(mohit.charAt(y));
				
			}
    public static void main(String args[]) {

		Scanner ms=new Scanner(System.in);
		String mohit=ms.next();
		CamelMohit(mohit);
    }
}
