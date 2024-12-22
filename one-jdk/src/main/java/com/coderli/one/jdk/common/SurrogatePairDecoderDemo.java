package com.coderli.one.jdk.common;

public class SurrogatePairDecoderDemo {

    // 将代理对还原为原始 Unicode 字符
    public static char[] decodeSurrogatePair(char high, char low) {
        // 检查是否为代理对
        if (!isHighSurrogate(high) || !isLowSurrogate(low)) {
            throw new IllegalArgumentException("Invalid surrogate pair.");
        }

        // 根据公式计算 Unicode 字符
        int unicodeValue = 0x10000 + ((high - 0xD800) << 10) + (low - 0xDC00);
        char[] decodedChars = Character.toChars(unicodeValue);  // 转换成字符
        return decodedChars;
    }

    // 判断高位代理
    public static boolean isHighSurrogate(char ch) {
        return ch >= 0xD800 && ch <= 0xDBFF;
    }

    // 判断低位代理
    public static boolean isLowSurrogate(char ch) {
        return ch >= 0xDC00 && ch <= 0xDFFF;
    }

    public static void main(String[] args) {
        char highSurrogate = 0xD83D; // 表情符号的高位代理
        char lowSurrogate = 0xDE00;  // 表情符号的低位代理
        
        char[] result = decodeSurrogatePair(highSurrogate, lowSurrogate);
        System.out.println("Decoded Character: " + new String(result));  // 输出 "😊"
    }
}