package com.fhzc.lambdaobject;

import java.util.List;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> javaList = PersonResult.javaProgrammers;
        List<Person> phpList = PersonResult.phpProgrammers;
        System.out.println("--------java工程师-------------");
        javaList.forEach((p)-> System.out.printf("%s %s; ",p.getFirstName(),p.getLastName()));
        System.out.println("");
        System.out.println("--------php工程师-------------");
        phpList.forEach((p)-> System.out.printf("%s %s; ",p.getFirstName(),p.getLastName()));
        System.out.println("");

        //涨工资

//        Consumer<Person> getRaise = e->e.setSalary(e.getSalary()/100*5+e.getSalary());
//        System.out.println("--------java工程师涨工资-------------");
//        javaList.forEach(getRaise);
//        javaList.forEach((p)-> System.out.printf("%s %s; ",p.getFirstName(),p.getSalary()));
//        System.out.println("");
//        System.out.println("--------php工程师涨工资--------------");
//        phpList.forEach(getRaise);
//        phpList.forEach((p)-> System.out.printf("%s %s; ",p.getFirstName(),p.getSalary()));

        System.out.println("-----salary more than 1400------");
        javaList.stream().filter((p)->(p.getSalary() > 1400)).forEach((p)-> System.out.printf("%s %s; ",p.getFirstName(),p.getSalary()));


        List<Person> sortedJavaList = javaList.stream().
                                        sorted((p1,p2)->(p1.getFirstName().compareTo(p2.getFirstName()))).
                                        limit(3).collect(toList());
        sortedJavaList.forEach((p)-> System.out.printf("%s %s ; ",p.getFirstName(),p.getLastName()));

    }
}
