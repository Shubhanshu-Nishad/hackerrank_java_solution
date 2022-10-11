import java.util.*;
public class Main {

    public static void mohitsumk(int targetmohit, int mohit[])
    {
        int sims=0;
        int eims=0;
        int pm=1;
        int resmohit=0;
        while(eims<=mohit.length-1)
        {
            pm*=mohit[eims];
            while(pm>=targetmohit && sims<=eims)
            {
                pm/=mohit[sims];
                sims++;
            }

            resmohit+=eims-sims+1;
            eims++;
        }
        System.out.println(resmohit);
    }
    public static void main (String args[]) {
        Scanner ms=new Scanner(System.in);
        int num=ms.nextInt();
        int targetmohit=ms.nextInt();
        int mohit[]=new int[num];
        for(int x=0;x<num;x++)
            mohit[x]=ms.nextInt();
        mohitsumk(targetmohit,mohit);

    }
}
