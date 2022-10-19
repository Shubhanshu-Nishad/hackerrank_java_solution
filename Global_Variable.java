package com.pradhumn;

public class Global_Variable {

    static int val = 100;

    public static void main(String[] args) {
        System.out.println("hey");
        int x = 90;
        fun(x);
        int val = 13;
        System.out.println(val);
//        fun1(23);
    }

    public static void fun(int x){
        int a = 90;
        System.out.println(x);
//        int val = 19;
//        val = 120;
        System.out.println(val);
    }

//    public static void fun1(int x){
//        int a2 = 80;
////        System.out.println(a);    //error
//        System.out.println(x);
//        System.out.println(val);
//    }

}
