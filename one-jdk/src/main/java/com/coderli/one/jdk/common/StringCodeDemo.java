package com.coderli.one.jdk.common;

public class StringCodeDemo {
    public static void main(String[] args) {
        String str = "Hello😀";

        // 获取字符串长度
        System.out.println("字符串的长度（字符数）：" + str.length()); // 7

        // 使用 codePointAt 来处理完整字符
        System.out.println("字符 '😀' 的 Unicode 码点：" + Integer.toHexString(str.codePointAt(5)).toUpperCase());
        System.out.println("字符 '😀' 的 Unicode 码点：" + str.codePointAt(5)); // 128512 (U+1F600)

        // 遍历字符串中的每个字符（注意代理对会被分开）
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("字符 " + c + " 的编码是：" + (int)c);
        }

        // 使用 codePointAt 获取完整的Unicode码点
        for (int i = 0; i < str.length(); ) {
            int codePoint = str.codePointAt(i);
            System.out.println("Unicode 码点: " + codePoint); // 会显示 U+1F600
            i += Character.charCount(codePoint); // 处理代理对
        }
    }
}
