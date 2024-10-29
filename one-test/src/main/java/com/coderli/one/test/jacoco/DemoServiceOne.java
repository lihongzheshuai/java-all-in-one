package com.coderli.one.test.jacoco;

/**
 * 本类用于研究Jacoco单元测试覆盖率工具使用方式
 * 本来是模拟业务类一
 * @author OneCoder
 * @Blog <a href="https://www.coderli.com">https://www.coderli.com</a>
 * @source <a href="https://github.com/lihongzheshuai/java-all-in-one">https://github.com/lihongzheshuai/java-all-in-one</a>
 */
public class DemoServiceOne {

    public String getAgeDes(int age) {
        if (age <= 20) {
            return "young";
        } else if (age > 60) {
            return "old";
        } else {
            return "others";
        }
    }

}
