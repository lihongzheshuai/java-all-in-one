package com.coderli.one.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author OneCoder
 * @Blog https://www.coderli.com
 */
public class LogMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogMain.class);
        logger.info("Hello World");
    }
}
