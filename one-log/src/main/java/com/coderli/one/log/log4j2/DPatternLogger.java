package com.coderli.one.log.log4j2;

import com.coderli.one.log.Slf4jLogMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本类用于验证%d Logger Pattern
 * @author OneCoder
 * @Blog https://www.coderli.com
 * @source https://github.com/lihongzheshuai/java-all-in-one
 */
public class DPatternLogger {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(DPatternLogger.class);
        logger.info("%d pattern: Hello World");
    }
}
