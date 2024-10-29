package com.coderli.one.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 本来用于演练Lambda表达式
 *
 * @blog <a href="https://www.coderli.com">https://www.coderli.com</a>
 */
public class LambdaDemo {

    public static void main(String[] args) {
        // 函数式接口Lambda实现
        LambdaFunctionalInterfaceDemo lambdaDemo = () -> System.out.println("Do something.");
        lambdaDemo.doSomething();

        LambdaInterfaceDemo lambdaInterfaceImpl = (name) -> System.out.println("LambdaInterface: " + name);
        lambdaInterfaceImpl.doSomething("Lambda Demo");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        // 使用 Lambda 表达式过滤
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
