package com.coderli.one.log.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本类用于验证%c Logger Pattern
 * @author OneCoder
 * @Blog https://www.coderli.com
 * @source https://github.com/lihongzheshuai/java-all-in-one
 */
public class CPatternLogger {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(CPatternLogger.class);
        logger.info("%c pattern: Hello World");
    }

}
