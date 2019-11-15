package com.fhzc;

import java.util.*;
import java.util.stream.Collectors;

public class HelloLamda {
    public static void main(String[] args) {

        System.out.println();
        List<String> list = Arrays.asList(new String [] {"c","b","a"});
        System.out.println(list);
//        Collections.sort(list,new Comparator<String>(){
//            public int compare(String str1, String str2){
//                return str1.compareTo(str2);
//            }
//        });
        Collections.sort(list,(str1,str2)->str1.compareTo(str2));
        System.out.println(list);

        List<String> proNames = Arrays.asList(new String[]{"Ni","Nao","Lamada"});
        List<String> lowercaseNames = new ArrayList<>();
        for (String str : proNames) {
            lowercaseNames.add(str.toLowerCase());
        }
        System.out.println(lowercaseNames);

        List<String> lowerCaseNames = proNames.stream().map(name -> {return name.toLowerCase();}).collect(Collectors.toList());
        System.out.println(lowerCaseNames);


    }
}
