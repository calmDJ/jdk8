package com.fhzc;

public class TestFBNQ {
    public static void main(String[] args) {
        int x = getNum(7);
        System.out.println(x);
    }

    public static int getNum(int x){
        if (x == 0 || x == 1) {
            return 1;
        }else {
            return getNum(x-1)+getNum(x-2);
        }
    }
}
