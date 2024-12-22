package com.coderli.one.jdk.common;

public class SurrogateCheckerDemo {
    public static boolean isHighSurrogate(char ch) {
        return ch >= 0xD800 && ch <= 0xDBFF; // 高位代理的范围
    }

    public static boolean isLowSurrogate(char ch) {
        return ch >= 0xDC00 && ch <= 0xDFFF; // 低位代理的范围
    }

    public static void main(String[] args) {
        char highSurrogate = 0xD83D; // 表情符号的高位代理
        char lowSurrogate = 0xDE00;  // 表情符号的低位代理
        char normalChar = 'A';       // 普通字符
        
        System.out.println("High Surrogate: " + isHighSurrogate(highSurrogate));  // true
        System.out.println("Low Surrogate: " + isLowSurrogate(lowSurrogate));    // true
        System.out.println("Normal Char: " + isHighSurrogate(normalChar));       // false
    }
}