package com.fhzc.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPredicate {
    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 59, 6666.66),
            new Employee(101, "张三", 18, 9999.99),
            new Employee(103, "王五", 28, 3333.33),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(105, "田七", 38, 5555.55)
    );
//    需求：获取公司中工资大于 5000 的员工信息
    @Test
    public void test1(){
        List<Employee> list = new ArrayList<>();
        for (Employee emp : emps) {
            if (emp.getSalary() > 5000) {
                list.add(emp);
            }
        }
        System.out.println(list);
    }

    public List<Employee> filterEmployee(List<Employee> emps, MyPredicate<Employee> mp){
        List<Employee> list = new ArrayList<>();

        for (Employee employee : emps) {
            if(mp.test(employee)){
                list.add(employee);
            }
        }

        return list;
    }

    //策略模式
    //匿名内部类
    @Test
    public  void test2(){
        List<Employee> list =
        filterEmployee(emps, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() > 5000;
            }
        });
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    //lambda表达式
    @Test
    public  void test3(){
        List<Employee> list =
                filterEmployee(emps, employee -> employee.getSalary() > 5000);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    @Test
    public  void test4(){
        emps.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .map(Employee::getSalary)
                .sorted()
                .forEach(System.out::println);
    }
}
