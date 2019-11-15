package com.fhzc;

import java.util.*;

public class SortTest {

    public static  int[] sort1(){
        int[] arr = {2,4,1,3,9,7,6,4,5,0,8};
        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tem = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        System.out.println(sort1());
        String[] stringArr = {"abc","bc","bcd","bcd","cd","abc","abc","cd","c","abc"};
        Map<String,Integer> countMap = new HashMap<>();
        for (String string : stringArr){
            if (countMap.containsKey(string)) {
                countMap.get(string);
                Integer count = Integer.parseInt(countMap.get(string).toString());
                count++;
                countMap.put(string,count);
            }else {
                countMap.put(string,1);
            }

        }
        System.out.println(countMap);
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(countMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        System.out.println(list);
    }
}
