package com.coderli.one.jdk8;

/**
 * 本来用于演练Lambda表达式
 * @blog <a href="https://www.coderli.com">https://www.coderli.com</a>
 */
public class LambdaDemo {

    public static void main(String[] args) {
        // 函数式接口Lambda实现
        LambdaFunctionalInterfaceDemo lambdaDemo = () -> System.out.println("Do something.");
        lambdaDemo.doSomething();

        LambdaInterfaceDemo lambdaInterfaceImpl = (name) -> System.out.println("LambdaInterface: " + name);
        lambdaInterfaceImpl.doSomething("Lambda Demo");

    }
}
