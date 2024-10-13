package com.coderli.one.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本类用于研究Slf4j日志接口集成原理
 * @author OneCoder
 * @Blog <a href="https://www.coderli.com">https://www.coderli.com</a>
 */
public class Slf4jLogMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jLogMain.class);
        logger.info("Hello World");
    }
}
