package com.fhzc;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest1 {
    public static void main(String[] args) {
        String[] players = {
                "Ra", "No",
                "St", "Da",
                "Ro", "An"};

        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });
        for (String player : players) {
            System.out.println(player);
        }
        System.out.println("-------分割线---------");
        Arrays.sort(players,(str1,str2)->(str1.compareTo(str2)));
        for (String player : players) {
            System.out.println(player);
        }

    }
}
