package com.fhzc;

import com.fhzc.lambdaobject.Person;
import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestLambda2 {
    @Test
    public void test1(){
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("什么都没有");

        Consumer<String> con1 = System.out::println;
        con1.accept("天气不错");

        Person p = new Person();
        p.setFirstName("doubleJ");
        Supplier<String> sup = ()->p.getFirstName();
        Supplier<String> sup1 = p::getFirstName;
        System.out.println(sup.get());
        System.out.println(sup1.get());
    }
}
