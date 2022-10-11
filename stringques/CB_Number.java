import java.util.*;
public class Main
{

	public static void main(String[] args) 
	
	{
	    Scanner ms=new Scanner(System.in);
	    int nummohit=ms.nextInt();
	String strmohit =ms.next();
		PrintSubStringmohit(strmohit);

	}
	
		public static boolean isvisited(boolean[] visited, int i, int j)
		
		{
		for (int k = i; k <= j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}


	public static void PrintSubStringmohit(String strmohit) 
	{
		int countmohit = 0;
		boolean visited[] = new boolean[strmohit.length()];
		for (int len = 1; len <= strmohit.length(); len++) {
			for (int j = len; j <= strmohit.length(); j++) {
				int i = j - len;
				String smohit = strmohit.substring(i, j);
				if (isCbNumbermohit(Long.parseLong(smohit)) == true && isvisited(visited, i, j - 1) == true) {
					countmohit++;
					for (int k = i; k <= j - 1; k++) {
						visited[k] = true;

					}
				}

		}

		}
		System.out.println(countmohit);

	}


	public static boolean isCbNumbermohit(long nummohit) 
	
	{
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (nummohit == 0 || nummohit == 1) 
			return false;
		
		for (int i = 0; i < arr.length; i++) {
			if (nummohit == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (nummohit % arr[i] == 0) 
			
				return false;
			
		}
		return true;

	}

}
