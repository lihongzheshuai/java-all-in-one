package com.coderli.one.log.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本类用于验证Rooter Logger Pattern
 * @author OneCoder
 * @Blog https://www.coderli.com
 * @source https://github.com/lihongzheshuai/java-all-in-one
 */
public class CommonPatternLogger {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(CommonPatternLogger.class);
        logger.info("Common Rooter pattern: Hello World");
    }
}
