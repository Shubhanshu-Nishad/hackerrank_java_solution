package com.pradhumn;

public class Main {
    public static void main(String[] args) {
        System.out.println("hey");
        addTwoNum();
//        subTwoNum();
        System.out.println("bye");
    }

    public static void addTwoNum(){
        int a = 9;
        int b = 11;
        int c = a+b;
        subTwoNum();
        System.out.println(c);
    }

    public static void subTwoNum(){
        int a = 9;
        int b = 11;
        int c = a-b;
        System.out.println(c);
    }

}
