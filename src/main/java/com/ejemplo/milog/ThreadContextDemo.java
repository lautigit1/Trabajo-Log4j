package com.ejemplo.milog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class ThreadContextDemo {

    private static final Logger logger = LogManager.getLogger("milog");

    public static void ejecutar() {
        ThreadContext.put("usuario", "juanperez");
        ThreadContext.put("operacion", "login");
        logger.info("Este log contiene contexto de usuario.");
        ThreadContext.clearAll();
    }
}
