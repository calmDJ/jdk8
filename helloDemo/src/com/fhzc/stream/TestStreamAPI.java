package com.fhzc.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamAPI {
    //2. 中间操作
    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 59, 6666.66),
            new Employee(101, "张三", 18, 9999.99),
            new Employee(103, "王五", 28, 3333.33),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(105, "田七", 38, 5555.55)
    );
    @Test
    public void test1(){
        Stream<Employee> stream = emps.stream()
                                      .filter(e->e.getAge() > 35);
        stream.forEach(System.out::println);

         emps.stream()
        .filter(e-> e.getAge() > 35)
        .forEach(System.out::println);
    }
    @Test
    public void test2(){
        emps.stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);
        Optional<Integer> op = emps.stream().map(Employee::getAge).reduce(Integer::sum);
        System.out.println(op.get());

    }
}
