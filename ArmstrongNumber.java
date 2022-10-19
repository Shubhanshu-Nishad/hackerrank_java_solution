package com.pradhumn;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 1634;
        System.out.println(countOfDigit(n));
    }

    public static boolean isArmstrongNum(int n){
        int pow = countOfDigit(n);
        int ans = 0;
        while (n>0){
            int rem = n%10;
            ans = (int) (ans + Math.pow(rem, pow));
            n/=10;
        }
        if (ans == n){
            return true;
        } else {
            return false;
        }
    }

    public static int countOfDigit(int n){
        int c = 0;
        while (n>0){
            n/=10;
            c++;
        }
        return c;
    }

}
