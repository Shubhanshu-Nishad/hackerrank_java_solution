public class _09_Continue
{
    public static void main(String args[])
    {
        int i=0;
        while(i<3)
        {
            i++;
            System.out.println("before"+i);
            if(i==2)
                continue;
            System.out.println("After"+i);
        }
//        for(int i=0; i<5; i++)
//        {
//            if(i==1 || i==2)
//                continue;
//            System.out.println(i);
//        }
    }
}
