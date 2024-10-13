package com.coderli.one.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 本类用于研究Log4j2原生日志接口使用方式
 * @author OneCoder
 * @Blog <a href="https://www.coderli.com">https://www.coderli.com</a>
 * @source <a href="https://github.com/lihongzheshuai/java-all-in-one">https://github.com/lihongzheshuai/java-all-in-one</a>
 */
public class Log4jLogMain {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4jLogMain.class);
        logger.info("This is a log from log4j-api.");
    }

}
