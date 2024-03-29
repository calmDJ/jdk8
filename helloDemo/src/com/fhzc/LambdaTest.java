package com.fhzc;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal",
                        "Novak Djokovic",
                        "Stanislas Wawrinka",
                        "David Ferrer"};
        List<String> players =  Arrays.asList(atp);

        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }

        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));

        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();

        new Thread(() -> System.out.println("Hello world !")).start();
        Runnable ra1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("what is lambda");
            }
        };
        Runnable ra2 = ()-> System.out.println("what is lambda");
        ra1.run();
        ra2.run();
    }
}
