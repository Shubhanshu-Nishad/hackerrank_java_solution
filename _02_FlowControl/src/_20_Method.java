public class _20_Method
{
    public static void fun1()
    {
        System.out.println("fun1() begin");
        fun2();
        System.out.println("fun1 Ended");
    }
    public static void fun2()
    {
        System.out.println("Inside fun2()");
    }

    public static void main(String args[])
    {
        System.out.println("Before call");
        fun1();
        System.out.println("after call");
    }
}
