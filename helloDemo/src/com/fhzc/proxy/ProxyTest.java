package com.fhzc.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
         Hello target = new HelloImpl();
         MyInvocationHandler handler = new MyInvocationHandler(target);
         Hello proxyObject = (Hello) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),
                 target.getClass().getInterfaces(), handler);
        proxyObject.sayHello("陈粒");

    }
}
