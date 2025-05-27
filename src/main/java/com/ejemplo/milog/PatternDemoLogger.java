package com.ejemplo.milog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PatternDemoLogger {

    private static final Logger logger = LogManager.getLogger("milog");

    public static void mostrarFormatos() {
        logger.info("Formato A: %d [%-6p] %c{1} - %m%n");
        logger.info("Formato B: %sn %d{yyyy/MM/dd HH:mm:ss,SSS} %r [%-6p] [%t] %c{3} %C{3}.%M(%F:%L) - %m%n");
    }
}
