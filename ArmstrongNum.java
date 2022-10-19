package com.pradhumn;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        System.out.println(Arms());
    }

    public static int countDigit(int n){

        int c = 0;
        while (n>0){
            n/=10;
            c++;
        }
        return c;
    }
    public static boolean Arms(){
        int n = 16;
        int d =0;
        while (n>0){
            int a = n%10;
            int b = a^n;
            d = d+b;
            int c = a/10;
            a  = c;
            if (d == n){
                return true;
            }
        }
        return false;
    }

}
